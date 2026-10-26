package beziehungen;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("Spedition Meier", "Hauptstraße 1, Berlin");
        LKW lkw1 = new LKW("B-ME 123", 12.5);
        LKW lkw2 = new LKW("B-ME 456", 9.0);

        lkw1.setFirma(firma);
        firma.fuhrparkHinzufuegen(lkw1);

        lkw2.setFirma(firma);
        firma.fuhrparkHinzufuegen(lkw2);

        firma.anzeigen();
        System.out.println("Anzahl LKW (ueber eigene Verwaltung): " + firma.getFuhrpark().size());

        System.out.println();
        System.out.println("--- Experiment: LKW aus Fuhrpark entfernen ---");
        firma.fuhrparkEntfernen(lkw1);

        System.out.println("Anzahl LKW nach Entfernen: " + firma.getFuhrpark().size());
        System.out.println("lkw1.getFirma() ist noch gueltig, zeigt zurueck auf: " + lkw1.getFirma().getName());
    }
}
