package vererbung;

public class PKW extends Fahrzeug {
    private int sitzplaetze;

    public PKW(String marke, String farbe, int geschwindigkeit, int sitzplaetze) {
        super(marke, farbe, geschwindigkeit);
        this.sitzplaetze = sitzplaetze;
    }

    @Override
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Sitzplätze: " + sitzplaetze);
    }
}