import java.util.ArrayList;


public class Evidence {
    private ArrayList<Zakaznik> seznam;

    public Evidence(ArrayList<Zakaznik> seznam) {
        this.seznam = seznam;
    }

    public void pridaniZakaznika(Zakaznik z) {
        seznam.add(z);
    }

    public void odebraniZakaznika(Zakaznik z) {
        seznam.remove(z);
    }


    public Zakaznik ziskaniPoslednihoZakaznika() {
        if (!seznam.isEmpty()) {
            return seznam.get(seznam.size() - 1);
        }
        return null;
    }

    public ArrayList<Zakaznik> getZakaznici() {
        return seznam;
    }

    public ArrayList<Zakaznik> vybraneZaznamy() {
        ArrayList<Zakaznik> vybraniZakaznici = new ArrayList<>();
        for(Zakaznik z : seznam) {
            if(z.getPocetProdeju() > 50) {
                vybraniZakaznici.add(z);
            }
        }
        return vybraniZakaznici;
    }

    public double prumernyPocetProdeju() {
        double soucetProdeju = 0;
        double pocetZakazniku = 0;
        
        for(Zakaznik z : seznam) {
            if("Uherské Hradiště".equals(z.getMesto())) {
                soucetProdeju += z.getPocetProdeju();
                pocetZakazniku++;
            }
        }

        if(pocetZakazniku > 0) {
            return soucetProdeju / pocetZakazniku;
        } else {
            return 0.0;
        }
    }

}
