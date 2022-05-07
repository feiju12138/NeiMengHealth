package pojo;

public class LoginResponseResult {

    private String cardcode;
    private String headImg;
    private String id;
    private String mobile;
    private String name;
    private String openid;
    private String password;
    private String source;
    private String sourceId;
    private String srcmpid;
    private String token;
    private String xcxOpenId;

    public String getCardcode() {
        return cardcode;
    }

    public void setCardcode(String cardcode) {
        this.cardcode = cardcode;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getSrcmpid() {
        return srcmpid;
    }

    public void setSrcmpid(String srcmpid) {
        this.srcmpid = srcmpid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getXcxOpenId() {
        return xcxOpenId;
    }

    public void setXcxOpenId(String xcxOpenId) {
        this.xcxOpenId = xcxOpenId;
    }

    @Override
    public String toString() {
        return "LoginResponseResult{" +
                "cardcode='" + cardcode + '\'' +
                ", headImg='" + headImg + '\'' +
                ", id='" + id + '\'' +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", openid='" + openid + '\'' +
                ", password='" + password + '\'' +
                ", source='" + source + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", srcmpid='" + srcmpid + '\'' +
                ", token='" + token + '\'' +
                ", xcxOpenId='" + xcxOpenId + '\'' +
                '}';
    }
}
