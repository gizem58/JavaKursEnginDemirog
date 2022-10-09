public class Main {

    public static void main(String[] args) {
        String ogrenci1= "Engin";
        String ogrenci2= "Derin";
        String ogrenci3= "Salih";
        String ogrenci4= "Ahmet";

        System.out.println(ogrenci1);                   //arrays= dizi
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------");


        
        //Bessere Variante: Durch das array, muss man nicht für jede Person System.out-println machen
        //du deklarierst eine Index in einer eckigen Klammer


            //diese leere Klammer nennt sich array
        String[] ogrenciler = new String[4];        //Aus drei Schülern besteht es
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";

        for(int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }


    }
}
