package pojo;

public class VaccineResponseItemRec {

    private String cli;
    private String dos;
    private String mfn;
    private String vcd;
    private String vcn;

    public String getCli() {
        return cli;
    }

    public void setCli(String cli) {
        this.cli = cli;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public String getMfn() {
        return mfn;
    }

    public void setMfn(String mfn) {
        this.mfn = mfn;
    }

    public String getVcd() {
        return vcd;
    }

    public void setVcd(String vcd) {
        this.vcd = vcd;
    }

    public String getVcn() {
        return vcn;
    }

    public void setVcn(String vcn) {
        this.vcn = vcn;
    }

    @Override
    public String toString() {
        return "=== 第" + dos + "针疫苗接种详情 ===\n" +
                "疫苗型号: " + vcn + "\n" +
                "疫苗生产商: " + mfn + "\n" +
                "接种时间: " + vcd + "\n" +
                "接种地址: " + cli + "\n" +
                "=========";
    }
}
