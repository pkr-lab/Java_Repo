package vererbung;

public class Main {

    public static void main(String[] args) {
        Fahrrad fahrrad = new Fahrrad("Canyon", "Rot", 0, 21);
        PKW pkw = new PKW("VW Golf", "Blau", 0, 5);

        System.out.println("--- Fahrrad ---");
        fahrrad.beschleunigen(15);
        fahrrad.bremsen(5);
        fahrrad.anzeigen();

        System.out.println();

        System.out.println("--- PKW ---");
        pkw.beschleunigen(100);
        pkw.bremsen(40);
        pkw.anzeigen();
    }
}
