package pojo;

import java.util.List;

public class VaccineResponseItem {

    private String btd;
    private String idn;
    private String mob;
    private String nam;
    private List<VaccineResponseItemRec> rec;
    private String sex;

    public String getBtd() {
        return btd;
    }

    public void setBtd(String btd) {
        this.btd = btd;
    }

    public String getIdn() {
        return idn;
    }

    public void setIdn(String idn) {
        this.idn = idn;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public List<VaccineResponseItemRec> getRec() {
        return rec;
    }

    public void setRec(List<VaccineResponseItemRec> rec) {
        this.rec = rec;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "VaccineResponseItem{" +
                "btd='" + btd + '\'' +
                ", idn='" + idn + '\'' +
                ", mob='" + mob + '\'' +
                ", nam='" + nam + '\'' +
                ", rec=" + rec +
                ", sex='" + sex + '\'' +
                '}';
    }
}
