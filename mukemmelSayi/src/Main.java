public class Main {

    public static void main(String[] args) {                //6 mükemmmel sayi cünkü 1, 2 ve 3 e bölünür
                                                                // 1+2+3= 6
                                                            //28: 1,2,4,7,14

        int number = 28;
        int total = 0;

       for(int i=1; i<number;i++){
           if(number%i==0){
               total=total+i;
           }
       }
if (total == number) {
    System.out.println("Mükemmel sayidir");
}else{
    System.out.println("Mükemmel sayi degildir");
}

    }
}
