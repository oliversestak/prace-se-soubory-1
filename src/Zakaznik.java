import java.time.LocalDate;
import java.util.ArrayList;

public class Zakaznik {
    private String jmeno;
    private LocalDate datumNarozeni;
    private String mesto;
    private int pocetProdeju;

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

    
    public String prevedeniDoSouboru() {
        return jmeno + ":" + datumNarozeni + ":" + mesto + ":" + pocetProdeju;
    }

    public void zvysPocetProdeju(int kladneCislo) {
        if(kladneCislo <= 0) {
            Vyjimka vyjimka = new Vyjimka("Počet prodejů není kladné číslo.");
            System.err.println(vyjimka);
        }

        pocetProdeju = pocetProdeju + kladneCislo;
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

