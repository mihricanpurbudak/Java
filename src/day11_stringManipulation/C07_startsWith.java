package day11_stringManipulation;

public class C07_startsWith {
    public static void main(String[] args) {

        String input="Java gungectikce guzellesiyor";

        System.out.println(input.startsWith("J"));//true

        System.out.println(input.startsWith(""));//true

        System.out.println(input.startsWith("gun",5));//true
        System.out.println(input.lastIndexOf("e"));
    }
}
