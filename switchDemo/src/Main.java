public class Main {

    public static void main(String[] args) {
	    char grade = 'F';                           //Du gibst einen Buchstaben ein

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Gectiniz");
                break;
            case 'B':
                System.out.println("Cok güzel : Gectiniz");
                break;
            case 'C':
                System.out.println("Iyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fena degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Maalesef : kaldiniz");
                break;
            default:                                        //Wenn man eine andere Buchstabe, was nicht oben ist, angibt
                System.out.println("gecersiz not girdiniz");
        }
    }
}
