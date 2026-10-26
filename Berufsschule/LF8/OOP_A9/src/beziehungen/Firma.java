package beziehungen;

import java.util.ArrayList;
import java.util.List;

public class Firma {
    private String name;
    private String adresse;
    private List<LKW> fuhrpark;

    public Firma(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
        this.fuhrpark = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public List<LKW> getFuhrpark() {
        return fuhrpark;
    }

    public void fuhrparkHinzufuegen(LKW lkw) {
        fuhrpark.add(lkw);
    }

    public void fuhrparkEntfernen(LKW lkw) {
        fuhrpark.remove(lkw);
    }

    public void anzeigen() {
        System.out.println("Name: " + name);
        System.out.println("Adresse: " + adresse);
        System.out.println("Anzahl LKW im Fuhrpark: " + fuhrpark.size());
        for (LKW lkw : fuhrpark) {
            System.out.println("  - " + lkw.getKennzeichen());
        }
    }
}
