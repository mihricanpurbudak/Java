package day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {

        //String str="1Bu2gu3n Ja*va-cok g3uz/el";
        //str i Bugun Java cok guzel haline getirin
        //replaceAll()metodundaki all in amaci butun karakterleri kapsamasidir
        //butun sayilari sil
        //butun ozel karakterleri sil

        //tum ozel karakterleri silelim dedigimizde space lerde siliniyor

        //space leri korumak icin en basta onlarin yerine cumlede bulunmayacak

        //bir string koyalim
        //"qazwsx"
       // str=str.replace("","qazwsx");


        //str=str.replaceAll("\\W","");
        //System.out.println(str);//1Bu2gu3nJavacokg3zel

        //str.replaceAll("\\d","");

        //istenmeyen ozel karakter ve sayilardan kurtuklduk
        //simdi spaceleri geri getirelim

        //str=str.replace("qazwsx","");

        //System.out.print(str);

        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        str=str.replace(" ", "qazwsx"); // ---> parantez icindekini ekledik
        System.out.println(str);              // 1Bu2gu3nqazwsxJa*va-qazwsxcokqazwsxg3uz/el

        str=str.replaceAll("\\W",""); // -----> sayi ve harf disindakileri cikardik
        System.out.println(str); // 1Bu2gu3nqazwsxJavaqazwsxcokqazwsxg3uzel

        str=str.replaceAll("\\d", ""); //----> SAYILARI CIKARDIK


        str= str.replace("qazwsx", " ");  // ----> anlamsiz olan kelimeyicikardik

        System.out.println(str);  // Bugun Java cok guzel


    }
    }

