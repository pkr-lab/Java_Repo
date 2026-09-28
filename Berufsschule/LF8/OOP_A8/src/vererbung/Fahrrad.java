package vererbung;

public class Fahrrad extends Fahrzeug {
    private int gaenge;
    private int aktuellerGang = 1;

    public Fahrrad(String marke, String farbe, int geschwindigkeit, int gaenge) {
        super(marke, farbe, geschwindigkeit);
        this.gaenge = gaenge;
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
}
