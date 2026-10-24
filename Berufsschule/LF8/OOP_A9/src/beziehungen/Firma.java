package beziehungen;

public class Firma {
    private String name;
    private String adresse;
    private LKW lkw;

    public Firma(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public LKW getLkw() {
        return lkw;
    }

    public void setLkw(LKW lkw) {
        this.lkw = lkw;
    }

    public void anzeigen() {
        System.out.println("Name: " + name);
        System.out.println("Adresse: " + adresse);
        System.out.println("LKW-Kennzeichen: " + lkw.getKennzeichen());
    }
}
