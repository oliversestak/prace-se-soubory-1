import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Evidence evidence = new Evidence(new ArrayList<>());
        evidence.pridaniZakaznika(new Zakaznik("Pavla", LocalDate.of(1999, 7, 14), "Uherské Hradiště", 51));
        evidence.pridaniZakaznika(new Zakaznik("Zdeňka", LocalDate.of(1974, 3, 28), "Uherské Hradiště", 64));

        Zakaznik posledniZakaznik = evidence.ziskaniPoslednihoZakaznika();
        evidence.odebraniZakaznika(posledniZakaznik);

        //zapsani zakazniku do souboru
        try(PrintWriter out = new PrintWriter(new File("zakaznici.txt"), "windows-1250")) {
            for(Zakaznik zakaznik : evidence.getZakaznici()) {
                String zapis = zakaznik.getJmeno() + ":" + zakaznik.getDatumNarozeni() + ":" + zakaznik.getMesto() + ":" + zakaznik.getPocetProdeju();

                out.println(zapis);
            }
        } catch (FileNotFoundException ex1) {
            System.err.println("Soubor nebyl nalezen.");
        }catch (UnsupportedEncodingException ex2) {
            System.err.println("Neznámé kódování.");
        }

        //nacteni zakazniku
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("zakaznici.txt")))) {
            while(scanner.hasNextLine()) {
                String nextline = scanner.nextLine();
                String[] polozky = nextline.split(":");
                String jmeno = polozky[0].trim();
                LocalDate narozeni = LocalDate.parse(polozky[1].trim());
                String mesto = polozky[2].trim();
                int pocetProdeju = Integer.parseInt(polozky[3].trim());
                Zakaznik zakaznik = new Zakaznik(jmeno, narozeni, mesto, pocetProdeju);
                evidence.pridaniZakaznika(zakaznik);
            }



        } catch (FileNotFoundException ex1) {
            System.err.println("Soubor nebyl nalezen.");
        } catch (Exception ex2) {
            System.err.println("Chyba při čtení souboru.");
        }





        //vyfiltrovani zakazniku s prodejem zbozi vetsi nez 50
        ArrayList<Zakaznik> vybraniZakaznici = evidence.vybraneZaznamy();
        System.out.println(vybraniZakaznici);

        //prumerny pocet prodeju zakazniku z Hradiste
        double prumernyProdejUH = evidence.prumernyPocetProdeju();
        System.out.println(prumernyProdejUH);
    }
}