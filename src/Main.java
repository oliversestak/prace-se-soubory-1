import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Evidence evidence1 = new Evidence(List.of(new Zakaznik("Pepa", LocalDate.of(2007, 10, 26), "Praha", 26), new Zakaznik("Jaroslav", LocalDate.of(2001, 4, 11), "Uherské Hradiště", 57)));

        Evidence evidence2 = new Evidence(new ArrayList<>());
        evidence2.pridaniZakaznika(new Zakaznik("Pavla", LocalDate.of(1999, 7, 14), "Praha", 51));
        evidence2.pridaniZakaznika(new Zakaznik("Zdeňka", LocalDate.of(1974, 3, 28), "Praha", 64));
    }
}