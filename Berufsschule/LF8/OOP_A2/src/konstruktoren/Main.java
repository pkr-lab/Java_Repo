package konstruktoren;

public class Main {

    public static void main(String[] args) {
        Fahrrad fahrrad1 = new Fahrrad("Trek", 21, 1, 0.0);
        Fahrrad fahrrad2 = new Fahrrad("Canyon", 18, 3, 5.5);

        fahrrad1.anzeigen();
        System.out.println();
        fahrrad2.anzeigen();
    }
}
