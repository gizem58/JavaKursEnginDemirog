public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 4.3, 5.6};       //Das ist wie = new double[4];
        double total=0;                             //für den Gesamtwert, fange bei 0 an
        double max= myList[2];                      //höchste Zahl ausgeben. du gibst zahl zwischen 0 und 3 wegen der index
        for (double number : myList) {              //"gehe die Zahlen in MyList durch"
            if(max<number){
                max=number;
            }
            total=total+number;
            System.out.println(number);
        }

        System.out.println("Toplam " + total);
        System.out.println("En büyük " + max);
    }
}
