public class Main {

    public static void main(String[] args) {
	    int number = 25;                                //asal sayi = Primzahl. Zahl über 1, die durch sich und 1 teilbar ist
        int remainder = number % 2;                     //Rest
        //System.out.println(remainder);
        boolean isPrime= true;          //ist eine Primzahl

        if(number==1){
            System.out.println("Kein Primzahl");
            return;
        }
        if(number<1){
            System.out.println("Zahl ungültig");
        }

        for(int i = 2; i<number; i++) {
            if (number % i == 0) {                    //Ist die Zahl teilbar dann ist es keine Primzahl, Start bei 2 Ende bei 25
                isPrime = false;                                                                    //da 25 die Eingabe ist, kann man ändern

            }
        }
            if(isPrime) {
                System.out.println("Zahl ist eine Primzahl");
            }else{
                System.out.println("Zahl ist keine Primzahl");
            }


        }


    }

//bug= Fehler, die das System macht