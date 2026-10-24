package beziehungen;

public class LKW {
    private String kennzeichen;
    private double ladekapazitaet;
    private Firma firma;

    public LKW(String kennzeichen, double ladekapazitaet) {
        this.kennzeichen = kennzeichen;
        this.ladekapazitaet = ladekapazitaet;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public double getLadekapazitaet() {
        return ladekapazitaet;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public void anzeigen() {
        System.out.println("Kennzeichen: " + kennzeichen);
        System.out.println("Ladekapazitaet: " + ladekapazitaet + " t");
        System.out.println("Firma: " + firma.getName());
    }
}
