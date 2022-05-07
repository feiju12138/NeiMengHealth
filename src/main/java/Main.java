import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import pojo.*;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 作者：绯鞠
 * 主页：https://feiju12138.github.io
 */
public class Main {

    private static final String URL_LUCHENG = "https://www.qikangkeji.com";
    private static final String URL_NeiMengHealth = "https://www.neimenghealth.com";

    static final Scanner scanner = new Scanner(System.in);
    static final OkHttpClient okHttpClient = new OkHttpClient();

    /*
    全局配置
     */
    private static String phone_number = "";
    private static String password = "";
    private static String register_code = "";
    private static String wxcode = "";


    /**
     * 密码加密为MD5
     */
    private static void passwordMd5() throws Exception {
        // 设置加密类型
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        // 开始加密
        md5.update(password.getBytes());
        // 加密一次后转换为字符串
        String password_md5 = new BigInteger(1, md5.digest()).toString(16);
//        System.out.println(password_md5);
        // 更新为加密后的密码
        password = password_md5;
    }

    /**
     * 注册鹿城
     *  发送验证码
     */
    private static void getRegisterCode() throws Exception {
        String urn = "/core/user/getUserMobileSendMessage";
        String parameter = "userMobile=" + phone_number + "&codeType=1";

        Request request = new Request.Builder().url(URL_LUCHENG + urn + "?" + parameter).build();
        Call call = okHttpClient.newCall(request);
        String response = call.execute().body().string();

        System.out.println(response);
    }

    /**
     * 注册鹿城
     *  开始注册
     */
    private static void register() throws Exception {
        String urn = "/core/user/checkUser";
        String parameter = "userMobile=" + phone_number + "&passWord=" + password + "&code=" + register_code + "&wxCode=" + wxcode;

        Request request = new Request.Builder().url(URL_LUCHENG + urn + "?" + parameter).build();
        Call call = okHttpClient.newCall(request);
        String response = call.execute().body().string();

        System.out.println(response);
    }

    /**
     * 登录鹿城
     *  开始登录
     */
    private static String login() throws Exception {
        String urn = "/core/user/login";
        String parameter = "userMobile=" + phone_number + "&&passWord=" + password + "&&loginType=2&&wxCode=" + wxcode + "&&hoxLogin=2&&thRegisterId=";

        Request request = new Request.Builder().url(URL_LUCHENG + urn + "?" + parameter).build();
        Call call = okHttpClient.newCall(request);
        String response = call.execute().body().string();

        LoginResponse loginResponse = new ObjectMapper().readValue(response, LoginResponse.class);

        System.out.println(loginResponse);

        String id = loginResponse.getResult().getId();
        return id;
    }

    /**
     * 通过用户名获取转发链接
     */
    private static String getURIFromUserId(String userId) throws Exception {
        String url = "https://lcjk.qikangkeji.com/core/plague/plagueAndTCN";
        String parameter = "type=NM_SHOW_ACCESS_CARD&&userId=" + userId;

        Request request = new Request.Builder().url(url + "?" + parameter).build();
        Call call = okHttpClient.newCall(request);
        String response = call.execute().body().string();

        ReturnResponse returnResponse = new ObjectMapper().readValue(response, ReturnResponse.class);

        System.out.println(returnResponse);

        String uri = returnResponse.getReturnContent();
        return uri;
    }

    /**
     * 通过转发链接获取2次转发链接中的onceCode
     */
    private static String getOnceCodeFromURI(String uri) throws Exception {

        Request request = new Request.Builder().url(uri).build();
        Call call = okHttpClient.newCall(request);
        Response response = call.execute();

        Headers headers = response.priorResponse().networkResponse().headers();
        Field namesAndValues = headers.getClass().getDeclaredField("namesAndValues");
        namesAndValues.setAccessible(true);
        String[] responseHeader = (String[]) namesAndValues.get(headers);

        System.out.println(Arrays.toString(responseHeader));

        int index = -1;
        for (int i = 0; i < responseHeader.length; i++) {
            if (responseHeader[i].equals("location")) {
                index = i + 1;
            }
        }
        String locationURL = responseHeader[index];
        int onceCodeIndex = locationURL.indexOf("onceCode");
        String onceCode = locationURL.substring(onceCodeIndex + 9, onceCodeIndex + 9 + 32);

        System.out.println(onceCode);

        return onceCode;
    }

    /**
     * 通过2次转发链接获取token
     */
    private static String getTokenFromOnceCode(String onceCode) throws Exception {

        String urn = "/api/v2/b2b/page/exchangetoken";
        String parameter = "onceCode=" + onceCode;

        Request request = new Request.Builder().url(URL_NeiMengHealth + urn + "?" + parameter).build();
        Call call = okHttpClient.newCall(request);
        String response = call.execute().body().string();

        ReturnResponse2 returnResponse2 = new ObjectMapper().readValue(response, ReturnResponse2.class);

        System.out.println(returnResponse2);

        String token = returnResponse2.getContent();
        return token;
    }

    /**
     * 通过token获取健康状态
     */
    private static HealthResponse getHealthFromToken(String token) throws Exception {

        String urn = "/api/v2/visitor/pass/inform/assess";

        Request request = new Request.Builder().url(URL_NeiMengHealth + urn)
                .addHeader("APPID", "HET_APP")
                .addHeader("cityCode", "150200")
                .addHeader("openType", "1")
                .addHeader("token", token)
                .build();
        Call call = okHttpClient.newCall(request);
        String response = call.execute().body().string();

        HealthResponse healthResponse = new ObjectMapper().readValue(response, HealthResponse.class);

        System.out.println(healthResponse);

        return healthResponse;
    }

    /**
     * 通过token获取疫苗接种情况
     */
    private static VaccineResponse getVaccineFromToken(String token) throws Exception {

        String urn = "/api/v2/visitor/pass/vaccine-info/query";

        Request request = new Request.Builder().url(URL_NeiMengHealth + urn)
                .addHeader("APPID", "HET_APP")
                .addHeader("cityCode", "150200")
                .addHeader("openType", "1")
                .addHeader("token", token)
                .build();
        Call call = okHttpClient.newCall(request);
        String response = call.execute().body().string();

        VaccineResponse vaccineResponse = new ObjectMapper().readValue(response, VaccineResponse.class);

        System.out.println(vaccineResponse);

        return vaccineResponse;
    }



    public static void main(String[] args) throws Exception {

        System.out.print("请输入手机号: ");
        phone_number = scanner.next();

        // 发送注册验证码
//        getRegisterCode();

        System.out.print("请输入密码: ");
        password = scanner.next();

        // 密码加密MD5
        passwordMd5();

//        System.out.print("请输入验证码（用于注册）: ");
//        register_code = scanner.next();

        // 开始注册
//        register();

        // 登录，获取userId
        String userId = login();

        // 获取转发链接
        String uri = getURIFromUserId(userId);

        // 转发后获取2次转发链接，并提取onceCode
        String onceCode = getOnceCodeFromURI(uri);

        // 通过onceCode获取token
        String token = getTokenFromOnceCode(onceCode);

        // 通过token获取健康状态
        HealthResponse healthResponse = getHealthFromToken(token);

        System.out.println(healthResponse.getItem().getNam() + "健康码颜色: " + healthResponse.getItem().getCol());

        // 通过token获取疫苗接种情况
        VaccineResponse vaccineResponse = getVaccineFromToken(token);

    }

}
