package pojo;

public class HealthResponseItemNuc {

    private String org;
    private String res;
    private String tim;

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

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

    @Override
    public String toString() {
        return "HealthResponseItemNuc{" +
                "org='" + org + '\'' +
                ", res='" + res + '\'' +
                ", tim='" + tim + '\'' +
                '}';
    }
}
