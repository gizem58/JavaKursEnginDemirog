import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String mesaj= "   Bugün hava cok güzel   ";

        System.out.println(mesaj);

       /* System.out.println("Eleman sayisi : " +mesaj.length());            //Eleman sayisi = Wie viel chars in dem SAtz oben
        System.out.println("5.Eleman : " +mesaj.charAt(4));                  //5.char soll gefunden werden, also n von bugün
        System.out.println(mesaj.concat(" Yasasin!"));
        System.out.println(mesaj.startsWith("B"));
        char[] karakterler= new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));             //In welcher Index ist a
        System.out.println(mesaj.lastIndexOf('e'));         //beginnt von links zwar zu zählen, nimmt aber den ersten buchstaben von rechts also überspringt er

*/
        String yeniMesaj= mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,4));             //ausgegeben wird es ab der 2.Index bis zur 4.


        for(String kelime : mesaj.split(" ",'-')){
            System.out.println(kelime);                         //schreibe den Satz untereinander split=spalte auf


            System.out.println(mesaj.toLowerCase());
            System.out.println(mesaj.toUpperCase());
            System.out.println(mesaj.trim());               //lösche die unnötigen Leerzeichen vorne und hinten
        }

    }
}
