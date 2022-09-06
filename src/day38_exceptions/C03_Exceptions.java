package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir array de tuttugumuzu varsayalim
        Kullaniciya index sorup ,o indexteki urunu yazdiran bir program hazirlayalim
        kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim
         */

        String[] urunler={"Nutella" ,"Cokokrem" ,"Sut" ,"Cay" ,"Findik" };
        Scanner scan=new Scanner(System.in);
        System.out.println("Istediginiz urunun sira nosunu giriniz");
        try {
            int istenenIndex=scan.nextInt();

        }catch(InputMismatchException deneme){
            deneme.getMessage();

            /*
            catch blogunun onundeki parantezde
            exception class inin ismi ve yaninda yakalanan exception i
            atadigimiz variablenin ismi olur
            eger yakalanan exception ile ilgili bilgileri kullaniciya
             */
        }
        System.out.println("Program calismaya devam ediyor");
    }
}
/*

package day38_exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class C03_Exceptions {
    public static void main(String[] args) {

          Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
          Kullaniciya index sorup, o index'deki urunu yazdiran bir
          program hazirlayalim
          Kullanici urun sayisindan buyuk bir index girerse
          exception vermesinin onune gecelim

String[] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};
    Scanner scan;
    int istenenSira=0;
    boolean kontrol=true;
        while(kontrol){
                try {
                scan= new Scanner(System.in);
                System.out.println("Istediginiz urunun sira nosunu giriniz");
                istenenSira =scan.nextInt();
                kontrol=false;
                } catch (InputMismatchException deneme) {
                System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
                }
                }
        /*
         catch blogunun onundeki parantezde
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)
         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz
         bu objeyi kullanabilirsiniz
         eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         */
            /*    try {
                System.out.println("Aradiginiz urun : " + urunler[istenenSira-1] );
                } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                "\nSira numarasi en fazla : " + urunler.length  + " olabilir" );
                }
                }
                }
                */


