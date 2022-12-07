public class Main {

    public static void main(String[] args) {

        /* ich habe ein array (also mehrere Kreditmanger) erstellt. Als erstes schreibt man den Datentyp also BaseKrediManager
        dann sagen wir new also das bedeutet im Heap Speicher wird ein neues Objekt erstellt damit wir das
        dort speichern können.
        new BaseKrediManager[] {new KrediManager1, new KrediManager2}
        die geschweiften Klammern sagen quasi was du da rein tun willst in dem Fall willst du zwei
        verschiedene Arten von KreditManager einbinden die von dem Interface BaseKrediManager erben
         */

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};


        /* die Schreibweise mit dem Doppelpunkt ist eine for each schleife, bedeutet eig nichts anderes als für jedes
        Element: Aus dem Array */
        //DIE SCHLEIFE HAT ZWEI ELEMENTE UND ER SOLL ALLE DURCHLAUFEN
        for (BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla(1000));


        }
    }
}
