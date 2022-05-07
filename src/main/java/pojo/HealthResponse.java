package pojo;

public class HealthResponse {

    private String code;
    private HealthResponseItem item;
    private String status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public HealthResponseItem getItem() {
        return item;
    }

    public void setItem(HealthResponseItem item) {
        this.item = item;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HealthResponse{" +
                "code='" + code + '\'' +
                ", item=" + item +
                ", status='" + status + '\'' +
                '}';
    }
}
