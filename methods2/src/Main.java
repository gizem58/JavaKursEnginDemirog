public class Main {

    public static void main(String[] args) {
            String mesaj="Bugün hava cok güzel";
            String yeniMesaj=sehirVer();                           //mesaj.substring(0,2); //substring bisey olusturdu ve sonuc olrarak onu veriyor
            System.out.println(yeniMesaj);
            int sayi = topla(5,7);
            System.out.println(sayi);
            int toplam = topla2(2,3,4,5,6,10);  //Wegen dem ...
            System.out.println(toplam);
    }                                                   //Void bize hicbisey vermiyor

    public static void ekle() {
        System.out.println("Eklendi");
    }


    public static void sil() {
        System.out.println("Silindi");
    }


    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2){      //Int wird zurückgegeben, aber return hinschreiben
            return sayi1+sayi2;
    }

    public static int topla2(int... sayilar) { //varible arguement
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer (){
        return "ankara";
    }


}
