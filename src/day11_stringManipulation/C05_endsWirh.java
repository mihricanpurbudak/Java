package day11_stringManipulation;

public class C05_endsWirh {
    public static void main(String[] args) {

        String str="Ah be Java ";

        System.out.println(str.endsWith("ava"));//true

        System.out.println(str.endsWith("be java"));//true

        System.out.println(str.endsWith("Ah be java"));//true


        System.out.println(str.endsWith(""));//true
        System.out.println(str.endsWith("bak java"));
    }
}
