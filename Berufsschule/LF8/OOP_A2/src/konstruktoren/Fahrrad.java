package konstruktoren;

public class Fahrrad {
    private String marke;
    private int gaenge;
    private int aktuellerGang;
    private double geschwindigkeit;

    public Fahrrad() {
        this.marke = "Unbekannt";
        this.gaenge = 1;
        this.aktuellerGang = 1;
        this.geschwindigkeit = 0.0;
    }

    public Fahrrad(String marke, int gaenge, int aktuellerGang, double geschwindigkeit) {
        this.marke = marke;
        this.gaenge = gaenge;
        this.aktuellerGang = aktuellerGang;
        this.geschwindigkeit = geschwindigkeit;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        if (marke == null || marke.isEmpty()) {
            System.out.println("Ungültige Marke: darf nicht leer sein.");
            return;
        }
        this.marke = marke;
    }

    public int getGaenge() {
        return gaenge;
    }

    public void setGaenge(int gaenge) {
        if (gaenge <= 0) {
            System.out.println("Ungültige Gangzahl: muss positiv sein.");
            return;
        }
        this.gaenge = gaenge;
    }

    public int getAktuellerGang() {
        return aktuellerGang;
    }

    public void setAktuellerGang(int aktuellerGang) {
        if (!istGangGueltig(aktuellerGang)) {
            System.out.println("Ungültiger Gang: muss zwischen 1 und " + gaenge + " liegen.");
            return;
        }
        this.aktuellerGang = aktuellerGang;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        if (geschwindigkeit < 0) {
            System.out.println("Ungültige Geschwindigkeit: darf nicht negativ sein.");
            return;
        }
        this.geschwindigkeit = geschwindigkeit;
    }

    private boolean istGangGueltig(int gang) {
        return gang >= 1 && gang <= gaenge;
    }

    public void gangHochschalten() {
        if (aktuellerGang < gaenge) {
            aktuellerGang++;
            System.out.println("Gang hochgeschaltet auf: " + aktuellerGang);
        } else {
            System.out.println("Bereits im höchsten Gang.");
        }
    }

    public void gangRunterschalten() {
        if (aktuellerGang > 1) {
            aktuellerGang--;
            System.out.println("Gang runtergeschaltet auf: " + aktuellerGang);
        } else {
            System.out.println("Bereits im niedrigsten Gang.");
        }
    }

    public void beschleunigen(double wert) {
        geschwindigkeit += wert;
        System.out.println("Fahrrad beschleunigt auf " + geschwindigkeit + " km/h.");
    }

    public void anzeigen() {
        System.out.println("Marke: " + marke);
        System.out.println("Gänge: " + gaenge);
        System.out.println("Aktueller Gang: " + aktuellerGang);
        System.out.println("Geschwindigkeit: " + geschwindigkeit + " km/h");
    }
}
