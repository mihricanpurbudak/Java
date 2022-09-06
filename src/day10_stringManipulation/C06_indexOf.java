package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";


        System.out.println(str.indexOf("0"));//5
        System.out.println(str.indexOf("g"));//6
        System.out.println(str.indexOf("t"));// bana integer donduruyor
                                             //int'de yok diye bir deger bulunmuyor
                                             //0 dersek J'nin index#idir
        String str5="wertyuio;lsdfsrzdtfziguohijolk.nbjvhcgxdftgzuhiopöl,mnbvfguhiujh" ;

        //str5'de p harfi var midir?

        if (str5.indexOf("p")==-1)
            System.out.println("str5 'de istenen karakter kullanilmamis" );
        else
            System.out.println("str5`te istenen karakter kullanilmis");
    }
}
