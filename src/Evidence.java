import java.util.ArrayList;
import java.util.List;

public class Evidence {
    List<Zakaznik> seznam;


    public Evidence(List<Zakaznik> seznam) {
        this.seznam = seznam;
    }

    public void pridaniZakaznika(Zakaznik z) {
        seznam.add(z);
    }

    public void odebraniZakaznika(Zakaznik z) {
        seznam.remove(z);
    }


    @Override
    public String toString() {
        return "Evidence{" +
                "seznam=" + seznam +
                '}';
    }
}
