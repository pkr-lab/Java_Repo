package kapselung;

public class Fahrrad {
    private String marke;
    private int gaenge;
    private int aktuellerGang;
    private double geschwindigkeit;

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        if (marke == null || marke.isEmpty()) {
            System.out.println("Marke darf nicht leer sein!");
        } else {
            this.marke = marke;
        }
    }

    public int getGaenge() {
        return gaenge;
    }

    public void setGaenge(int gaenge) {
        if (gaenge <= 0) {
            System.out.println("Anzahl Gänge muss positiv sein!");
        } else {
            this.gaenge = gaenge;
        }
    }

    public int getAktuellerGang() {
        return aktuellerGang;
    }

    public void setAktuellerGang(int gang) {
        if (!istGangGueltig(gang)) {
            System.out.println("Gang " + gang + " ist nicht gültig (1 bis " + gaenge + ").");
        } else {
            this.aktuellerGang = gang;
        }
    }

    private boolean istGangGueltig(int gang) {
        return gang >= 1 && gang <= gaenge;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        if (geschwindigkeit < 0) {
            System.out.println("Geschwindigkeit kann nicht negativ sein!");
        } else {
            this.geschwindigkeit = geschwindigkeit;
        }
    }

    public void gangHochschalten() {
        if (aktuellerGang < gaenge) {
            aktuellerGang = aktuellerGang + 1;
            System.out.println("Hochgeschaltet auf Gang " + aktuellerGang + ".");
        } else {
            System.out.println("Höchster Gang bereits erreicht!");
        }
    }

    public void gangRunterschalten() {
        if (aktuellerGang > 1) {
            aktuellerGang = aktuellerGang - 1;
            System.out.println("Runtergeschaltet auf Gang " + aktuellerGang + ".");
        } else {
            System.out.println("Niedrigster Gang bereits erreicht!");
        }
    }

    public void beschleunigen(double wert) {
        if (wert < 0) {
            System.out.println("Tretleistung muss positiv sein!");
        } else {
            geschwindigkeit = geschwindigkeit + wert;
            System.out.println(marke + " fährt jetzt " + geschwindigkeit + " km/h.");
        }
    }

    public void anzeigen() {
        System.out.println("Marke: " + marke);
        System.out.println("Gänge: " + gaenge);
        System.out.println("Aktueller Gang: " + aktuellerGang);
        System.out.println("Geschwindigkeit: " + geschwindigkeit + " km/h");
    }
}