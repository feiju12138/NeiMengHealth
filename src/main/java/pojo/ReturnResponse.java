package pojo;

public class ReturnResponse {

    private String returnContent;
    private String returnMsg;
    private String state;

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ReturnResponse{" +
                "returnContent='" + returnContent + '\'' +
                ", returnMsg='" + returnMsg + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
