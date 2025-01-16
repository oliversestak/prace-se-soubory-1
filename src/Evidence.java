import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Evidence {
    private List<Zakaznik> seznam;


    public Evidence(List<Zakaznik> seznam) {
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

    public void ulozDoSouboru(String nazevSouboru) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nazevSouboru))) {
            for(Zakaznik zakaznik : seznam) {
                writer.write(zakaznik.prevedeniDoSouboru());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Chyba při uložení zákazníka do souboru");
        }
    }

    @Override
    public String toString() {
        return "Evidence{" +
                "seznam=" + seznam +
                '}';
    }
}
