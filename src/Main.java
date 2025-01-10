import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Evidence evidence = new Evidence(List.of(new Zakaznik("Pepa", LocalDate.of(2007, 10, 26),"Praha", 26)));
        System.out.println(evidence);
    }
}