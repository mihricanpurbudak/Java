package day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java cok kolay,java cok guzel";
        String kelime ="Java";

        /*verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
        -verilen kelime cumlede kullanilmamis
        -verilen kelime cumlede sadece bir kere kullanilmis
        -verilen kelime cumlede birden fazla kullanilmis
         */

    int kelimeIlkIndex=cumle.indexOf(kelime);
    int kelimeSonIndex=cumle.lastIndexOf(kelime);

    if (kelimeIlkIndex==-1) {
        System.out.println("verilen kelime cumlede kullanilmamis");
    }else if (kelimeSonIndex==kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sedece bir kere kullanilmis");
        }else {
        System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }
    }

    }

