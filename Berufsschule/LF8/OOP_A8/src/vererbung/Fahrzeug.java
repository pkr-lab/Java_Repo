package vererbung;

public class Fahrzeug {
    private String marke;
    private String farbe;
    private int geschwindigkeit;

    public Fahrzeug(String marke, String farbe, int geschwindigkeit) {
        this.marke = marke;
        this.farbe = farbe;
        this.geschwindigkeit = geschwindigkeit;
    }

    public String getMarke() {
        return marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void beschleunigen(int wert) {
        geschwindigkeit = geschwindigkeit + wert;
        System.out.println(marke + " beschleunigt auf " + geschwindigkeit + " km/h.");
    }

    public void bremsen(int wert) {
        geschwindigkeit = geschwindigkeit - wert;
        if (geschwindigkeit < 0) {
            geschwindigkeit = 0;
        }
        System.out.println(marke + " bremst auf " + geschwindigkeit + " km/h.");
    }

    public void anzeigen() {
        System.out.println("Marke: " + marke);
        System.out.println("Farbe: " + farbe);
        System.out.println("Geschwindigkeit: " + geschwindigkeit + " km/h");
    }
}
