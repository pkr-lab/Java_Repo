package beziehungen;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Teil 1: einseitige Beziehung (Firma -> LKW) ---");
        Firma firma = new Firma("Spedition Meier", "Hauptstraße 1, Berlin");
        LKW lkw = new LKW("B-ME 123", 12.5);

        firma.setLkw(lkw);
        firma.anzeigen();

        System.out.println();
        System.out.println("--- Teil 2: beidseitige Beziehung ---");
        Firma firma2 = new Firma("Logistik Schmidt", "Industrieweg 9, Hamburg");
        LKW lkw2 = new LKW("HH-LS 456", 18.0);

        firma2.setLkw(lkw2);
        lkw2.setFirma(firma2);

        firma2.anzeigen();
        System.out.println();
        lkw2.anzeigen();

        System.out.println();
        System.out.println("--- Experiment: Assoziation loesen ---");
        firma2.setLkw(null);

        System.out.println("lkw2.getFirma() ist noch gueltig, zeigt zurueck auf: " + lkw2.getFirma().getName());

        System.out.println("Jetzt firma2.getLkw().getKennzeichen() aufrufen ...");
        System.out.println(firma2.getLkw().getKennzeichen());
    }
}
