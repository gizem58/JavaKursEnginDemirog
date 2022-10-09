public class Main {

    public static void main(String[] args) {                //döngü=Schleife

        //for
        for (int i = 1; i < 10; i += 2) {      //i++   bedeutet i=i+1
            System.out.println(i);
        }
        System.out.println("Schleife bitti");

/* i oben kann man nur oben innerhalb des Blockes benutzen, um i erneut zu verwenden, muss die
Variable neu definiert werden
 */
        //while
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While-Schleife bitti");


        //do while Schleife
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);

        System.out.println("While do -Schleife bitti");
    }
}
/*Unterschied zu der normalen while-Schleife ist, dass die unterere erst bei do beginnt und dann while somit es zb die 100
trotzdem erscheinen lässt
Also es funktioniert wengistens einmal */
