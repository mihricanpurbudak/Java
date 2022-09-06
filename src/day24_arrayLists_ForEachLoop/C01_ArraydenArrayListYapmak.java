package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr={"Ismail" , "Nurullah" , "Fatih"};
        /*
        uzun lısteler olusturmamız gerektıgınde
        tek tek eklemek yerine array olusturup ,bunlari list e cevirmek
         daha pratik olabilir
         1-loop ile Array deki tum elementleri list e atabiliriz
         2-Arrays asList() kullanabiliriz
             - Ancak bu method un 2 tane kotu yan etkisi vardir

              -Arrays class i kullanildigi icin array ozellikleri gecerli olur
              dolayisiyla listte olan add,remove gibi size i
              degistiren methodlar bu sekilde olusturulan listlerde kullanilamaz.
              -kaynak olan array ila urun olan list ozdeslestirilir .birinde yapilan
              degisiklik ,otomatik olarak digerine de islenir

         */
       List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList);//[Ismail,Nurullah,Fatih]

        //1.yan etki
        // sinifList.add("Erdi");//UnsupportedOperationException
        //sinifList.remove(1);//UnsupportedOperationException
        //Array deki add,remove gibi method lari kullaninca
        // Compile error vermemesine ragmen runner error veriyor



        //2.yan etki

        arr[1]="Emre";
        System.out.println("degisim sonrasi array :" +Arrays.toString(arr));
        System.out.println("Array i degistirince List :"+sinifList);  //array i degistirince list de degisiyor.


        sinifList.set(0,"Utku");
        System.out.println("List i degistirince list :" +sinifList);
        System.out.println("List i i degistirince array :"+Arrays.toString(arr));//list i degistirince array de degisiyor


      //bu iki yan etkiden dolayi bu yontemin kolay yazdirmak disinda bir artisi yok








    }
}
