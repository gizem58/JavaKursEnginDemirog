public class Main {
//Video 29 nochmals anschauen und 30 vllt auch
    public static void main(String[] args) {
        //Klassen sind REferenz-Typen(=Objekte, Strings und Arrays)
        //CustomerManager wie Int oder String. customerManager wird erzeugt
        //Um die Klasse zu benutzen brauche ich new
        CustomerManager customerManager = new CustomerManager(); //Ich rufe die Klasse auf und hhier gebe ich auch einen beliebigen Namen
        customerManager.Add();
        customerManager.Remove();
        customerManager.Uptade();

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2 = sayilar1;            //also 1,2,3
        sayilar1[0]=10;                 //normalerweise 1 aber, es wird ge#ndert und wird 10
        System.out.println(sayilar2[0]);


    }
}


