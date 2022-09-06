package day3_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        // bir onceki swap sorusunu bos kova kullanmadan yapin

        int sayi1= 15;
        int sayi2=20;

        sayi1=sayi1+sayi2;//15+20=35
        sayi2=sayi1-sayi2;//35-20=15
        sayi1=sayi1-sayi2;//35-15=20

        System.out.println("swaptan sonra sayi1 " +sayi1);
        System.out.println("swaptan sonra sayi2 " +sayi2);

    }
}
