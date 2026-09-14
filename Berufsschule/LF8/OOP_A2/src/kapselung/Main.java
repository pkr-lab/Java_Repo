package kapselung;

public class Main {

    public static void main(String[] args) {
        Fahrrad meinRad = new Fahrrad();

        meinRad.setMarke("Cube Aim");
        meinRad.setGaenge(7);
        meinRad.setAktuellerGang(1);
        meinRad.setGeschwindigkeit(0);

        meinRad.anzeigen();
        System.out.println();

        meinRad.beschleunigen(10);
        meinRad.gangHochschalten();
        meinRad.gangHochschalten();
        meinRad.beschleunigen(5);
        System.out.println();

        System.out.println("--- Sabotage-Test ---");
        meinRad.setGeschwindigkeit(-50);
        meinRad.setAktuellerGang(99);
        meinRad.setMarke("");

        System.out.println();
        meinRad.anzeigen();
    }
}