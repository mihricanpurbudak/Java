package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        //kullanicidan bir sayi isteyin
        //sayi pozitif ise sayiyi yazdirin
        // sayi negatif ise bir sayi daha isteyin ve ikisinin carpimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        double sayi=scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);
        } else {
            System.out.println("Lutfen bir sayi daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);

        }
        /* Eger if else icerisinde yeni kodlar varsa
         ternary ile ypmamiz mumkun olmaz
         */
    }
}
