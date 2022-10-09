public class Main {

    public static void main(String[] args) {
        int sayi = 24;

        if (sayi < 20) {          //Durch die geschweifte Klammer, machst du hier ein Block, der arbeiten soll
            System.out.println("Sayi 20 den kücüktür");
        }                       //Block geht nur bis hierhin
        else if (sayi==20) {                                     //Operator
            System.out.println("Sayi 20 'ye essittir");
        }else {
            System.out.println("Sayi 20 den büyüktür");

        }
    }
}
