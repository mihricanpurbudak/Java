package day11_stringManipulation;

public class C04_contains {
    public static void main(String[] args) {

        /*Soru 2) Kullanicidan bir cumle isteyin.
         Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
         “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
         iki kelimeyi de icermiyorsa
         “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */




        //requirements de buyuk harf hassasiyeti hakkinda birsey soylenmemis
        //ikinci olarak da her iki kelimeyi de icerme durumu aciklanmamis
        //bu durumda gorevi bize kim verdiyse ona sormak lazim

        //ek requirements :ikisini de icerioyorsa
        // "Karar ver buyuk mu yazdirayim ,kkucuk mu?
        //case sensitive olmasin

      //  if (cumle.contains("buyuk")) {
            //System.out.println(cumle.toUpperCase());

       // }else if (cumle.contains("kucuk")) {
           // System.out.println(cumle.toLowerCase());

       // }else if (cumle.contains("kucuk") && cumle.contains("buyuk")){
          //  System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu");


        String cumle="Java buyuk , Dunya kucuk";
        cumle=cumle.toLowerCase();

        if (cumle.contains("kucuk") && cumle.contains("buyuk")) {
            System.out.println("karar ver buyuk mu yazdiryim kucuk mu");
        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        }else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }


    }
}














