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


}
