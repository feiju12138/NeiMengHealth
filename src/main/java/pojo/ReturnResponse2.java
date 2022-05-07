package pojo;

public class ReturnResponse2 {

    private String code;
    private String content;
    private String message;
    private String once;
    private String sign;
    private String status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOnce() {
        return once;
    }

    public void setOnce(String once) {
        this.once = once;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReturnResponse2{" +
                "code='" + code + '\'' +
                ", content='" + content + '\'' +
                ", message='" + message + '\'' +
                ", once='" + once + '\'' +
                ", sign='" + sign + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
