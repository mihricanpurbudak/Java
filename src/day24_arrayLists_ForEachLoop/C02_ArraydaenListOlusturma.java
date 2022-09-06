package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydaenListOlusturma {
    public static void main(String[] args) {
 /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */
        Random rnd=new Random();          //(random objesi)     //Randomun ozellıgı 0 ıle 1 arasında sayı uretır.
        int sayi=0;                       //sayi
        List<Integer> sayiListesi=new ArrayList<>();//(list)
        while(sayiListesi.size()<200){
            sayi= rnd.nextInt(1000);      //Random bound ise istedigimiz kadar sayi uretir.
                                                // bu nedenle burda random bound kullaniyoruz
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);


        boolean bildiMi=false;  //(While i kontrol etmek icin boolean  olusturuyoruz)
        int tahminSayisi=1;
        Scanner scan= new Scanner(System.in);
        while(!bildiMi){ // bildiMi==false
            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi=scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;
            }else{
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");
                tahminSayisi++;
            }
        }
    }
}



