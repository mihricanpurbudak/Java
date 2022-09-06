package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen String deki kullanilan harflaeri tekrarsiz olarak yazdirip
        //kelimede kullanilan harf sayisini veren bir method yapiniz

        String input="Java her zaman guzel";

        tekrarsizYap(input);
    }
    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W","");//Java her zaman guzel

        System.out.print(input.substring(0,1));//J
        benzersizInput+=input.substring(0,1);//J

        for (int i = 0; i <islenecekKelime.length() ; i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(","+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }



        }
        System.out.println("");
        System.out.println("input: "+ input);
        System.out.println("benzersiz input : "+ benzersizInput);
    }
}
