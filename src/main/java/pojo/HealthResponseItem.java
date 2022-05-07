package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HealthResponseItem {

    private String anr;
    private String aur;
    private String col;
    private String cop;
    private String cot;
    private String cty;
    private String etm;

    @JsonProperty("for")
    private String for_;

    private List<String> hea;
    private String idc;
    private List<String> liv;
    private String mob;
    private String nam;

    private HealthResponseItemNat nat;
    private HealthResponseItemNuc nuc;
    private List<HealthResponseItemNus> nus;

    private String sex;
    private String sup;
    private List<String> sxj;
    private String tem;

    public String getAnr() {
        return anr;
    }

    public void setAnr(String anr) {
        this.anr = anr;
    }

    public String getAur() {
        return aur;
    }

    public void setAur(String aur) {
        this.aur = aur;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getCop() {
        return cop;
    }

    public void setCop(String cop) {
        this.cop = cop;
    }

    public String getCot() {
        return cot;
    }

    public void setCot(String cot) {
        this.cot = cot;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getEtm() {
        return etm;
    }

    public void setEtm(String etm) {
        this.etm = etm;
    }

    public List<String> getHea() {
        return hea;
    }

    public void setHea(List<String> hea) {
        this.hea = hea;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public List<String> getLiv() {
        return liv;
    }

    public void setLiv(List<String> liv) {
        this.liv = liv;
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

    public HealthResponseItemNat getNat() {
        return nat;
    }

    public void setNat(HealthResponseItemNat nat) {
        this.nat = nat;
    }

    public HealthResponseItemNuc getNuc() {
        return nuc;
    }

    public void setNuc(HealthResponseItemNuc nuc) {
        this.nuc = nuc;
    }

    public List<HealthResponseItemNus> getNus() {
        return nus;
    }

    public void setNus(List<HealthResponseItemNus> nus) {
        this.nus = nus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSup() {
        return sup;
    }

    public void setSup(String sup) {
        this.sup = sup;
    }

    public List<String> getSxj() {
        return sxj;
    }

    public void setSxj(List<String> sxj) {
        this.sxj = sxj;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    @Override
    public String toString() {
        return "HealthResponseItem{" +
                "anr='" + anr + '\'' +
                ", aur='" + aur + '\'' +
                ", col='" + col + '\'' +
                ", cop='" + cop + '\'' +
                ", cot='" + cot + '\'' +
                ", cty='" + cty + '\'' +
                ", etm='" + etm + '\'' +
                ", hea=" + hea +
                ", idc='" + idc + '\'' +
                ", liv=" + liv +
                ", mob='" + mob + '\'' +
                ", nam='" + nam + '\'' +
                ", nat=" + nat +
                ", nuc=" + nuc +
                ", nus=" + nus +
                ", sex='" + sex + '\'' +
                ", sup='" + sup + '\'' +
                ", sxj=" + sxj +
                ", tem='" + tem + '\'' +
                '}';
    }
}
