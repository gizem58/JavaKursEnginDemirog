public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int [] {1,2,5,7,9,0};
        int aranacak = 5;                               //Soru 5 icinde varmi, yokmu?
        boolean GibtEsDieZahl = false;

        for (int sayi : sayilar){           //Nur eine Zahl von allen und frage ob die aranack mit der Zahl identisch ist
            if(sayi==aranacak){
                GibtEsDieZahl=true;
                break;

            }
            }

        if(GibtEsDieZahl)   {            //Ist das Gleiche wie gibtesdieZahl==true
            System.out.println("Es gibt diese Zahl");
        }else{
            System.out.println("Es gibt diese Zahl nicht");
        }


    }
}

