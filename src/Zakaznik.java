import java.time.LocalDate;

public class Zakaznik {
    String jmeno;
    LocalDate datumNarozeni;
    String mesto;
    int pocetProdeju;

    public Zakaznik(String jmeno, LocalDate datumNarozeni, String mesto, int pocetProdeju) {
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
        this.mesto = mesto;
        this.pocetProdeju = pocetProdeju;
    }





    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public int getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(int pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }


    @Override
    public String toString() {
        return "Zakaznik{" +
                "jmeno='" + jmeno + '\'' +
                ", datumNarozeni=" + datumNarozeni +
                ", mesto='" + mesto + '\'' +
                ", pocetProdeju=" + pocetProdeju +
                '}';
    }
}
