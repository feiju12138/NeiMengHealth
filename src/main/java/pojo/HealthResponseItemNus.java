package pojo;

public class HealthResponseItemNus {

    private String res;
    private String tim;
    private String org;

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getTim() {
        return tim;
    }

    public void setTim(String tim) {
        this.tim = tim;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Override
    public String toString() {
        return "HealthResponseItemNusData{" +
                "res='" + res + '\'' +
                ", tim='" + tim + '\'' +
                ", org='" + org + '\'' +
                '}';
    }
}
