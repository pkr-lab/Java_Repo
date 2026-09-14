package kapselung;

public class Hund {
    private String marke;
    private String name;
    private int anzahlBeine;
    private boolean bellen;

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        if (marke == null || marke.trim().isEmpty()) {
            System.out.println("Ungültige Marke: darf nicht leer sein.");
            return;
        }
        this.marke = marke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Ungültiger Name: darf nicht leer sein.");
            return;
        }
        this.name = name;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public void setAnzahlBeine(int anzahlBeine) {
        if (anzahlBeine < 0) {
            System.out.println("Ungültige Beinanzahl: darf nicht negativ sein.");
            return;
        }
        this.anzahlBeine = anzahlBeine;
    }

    public boolean isBellen() {
        return bellen;
    }

    public void setBellen(boolean bellen) {
        this.bellen = bellen;
    }

    public void bellenUmschalten() {
        bellen = !bellen;
        System.out.println(name + (bellen ? " bellt jetzt." : " ist jetzt ruhig."));
    }

    public void rufNamen() {
        System.out.println(name);
    }

    public void anzeigen() {
        System.out.println("Name: " + name);
        System.out.println("Marke: " + marke);
        System.out.println("Anzahl Beine: " + anzahlBeine);
        System.out.println("Bellen: " + bellen);

        // Type-Casting: ohne (double)-Cast würde int/int abgerundet werden (z.B. 0 statt 75.0)
        double beinAnteilProzent = (double) anzahlBeine / 4 * 100;
        System.out.println("Beinanteil ggü. einem Normalhund (4 Beine): " + beinAnteilProzent + "%");
    }

    public static void main(String[] args) {
        Hund meinHund = new Hund();

        meinHund.setMarke("Pitbull");
        meinHund.setName("Ben");
        meinHund.setAnzahlBeine(4);
        meinHund.setBellen(false);

        meinHund.anzeigen();
        System.out.println();

        meinHund.rufNamen();
        meinHund.bellenUmschalten();
        System.out.println();

        System.out.println("Sabotage-Test:");
        meinHund.setName("   ");
        meinHund.setMarke("");
        meinHund.setAnzahlBeine(-3);
        meinHund.anzeigen();
    }
}
