package day18_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan baslngic ve bitis harflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin
         */

        char ilkHarf='f';
        char sonHarf='t';

        char temp=ilkHarf;
        String buyult="";

        while (temp<=sonHarf){
            buyult=(temp+"").toUpperCase();
            System.out.print(buyult+ " ");
           // System.out.print((temp+"").toUpperCase());
            temp+=1;

        }
    }
}
