package pojo;

public class VaccineResponse {

    private String code;
    private VaccineResponseItem item;
    private String status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public VaccineResponseItem getItem() {
        return item;
    }

    public void setItem(VaccineResponseItem item) {
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
        return "VaccineResponse{" +
                "code='" + code + '\'' +
                ", item=" + item +
                ", status='" + status + '\'' +
                '}';
    }
}
