import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Evidence evidence = new Evidence(new ArrayList<>());
        evidence.pridaniZakaznika(new Zakaznik("Pavla", LocalDate.of(1999, 7, 14), "Praha", 51));
        evidence.pridaniZakaznika(new Zakaznik("Zdeňka", LocalDate.of(1974, 3, 28), "Praha", 64));

        Zakaznik posledniZakaznik = evidence.ziskaniPoslednihoZakaznika();
        evidence.odebraniZakaznika(posledniZakaznik);

        evidence.ulozDoSouboru("zakaznici.txt");

    }
}