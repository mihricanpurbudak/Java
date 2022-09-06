package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {

        //verilen bir input u tersine cevirip,
        // bize donduren bir method olusrurun

        String input = "hey gidi for loop gunleri";

        String tersInput = tersineCevir(input);

        System.out.println(tersInput);

    }

    private static String tersineCevir(String input) {
        StringBuilder sb = new StringBuilder();

        return sb.reverse().toString();
    }



}