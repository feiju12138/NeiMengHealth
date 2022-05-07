package pojo;

public class HealthResponseItemNat {

    private String cin;
    private String cod;
    private String con;
    private String prn;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    @Override
    public String toString() {
        return "HealthResponseItemNat{" +
                "cin='" + cin + '\'' +
                ", cod='" + cod + '\'' +
                ", con='" + con + '\'' +
                ", prn='" + prn + '\'' +
                '}';
    }
}
