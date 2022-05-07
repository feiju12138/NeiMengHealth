package pojo;

public class LoginResponse {
    
    private String message;
    private LoginResponseResult result;
    private String state;
    private String userMobile;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoginResponseResult getResult() {
        return result;
    }

    public void setResult(LoginResponseResult result) {
        this.result = result;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "message='" + message + '\'' +
                ", result=" + result +
                ", state='" + state + '\'' +
                ", userMobile='" + userMobile + '\'' +
                '}';
    }
}
