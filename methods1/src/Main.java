public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }
    public static void sayiBulmaca() {
        int[] sayilar = new int [] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean GibtEsDieZahl = false;

        for (int sayi : sayilar){
            if(sayi==aranacak){
                GibtEsDieZahl=true;
                break;
            }
        }

        if(GibtEsDieZahl)   {            //Ist das Gleiche wie gibtesdieZahl==true
            mesajVer("Sayi mevcuttur:" +aranacak);
        }else{
            mesajVer("Sayi mevcutturdegildir:" +aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }

}

// //