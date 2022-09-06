package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {


    /*
    Binary Search java da eleman aramanin kisa yoludur
    Anack binary search calismasi icin once arrayin sirali hale getirilmesi gerekir
    Eger siralama yapmadan binary search yaparsaniz
    sonucu bulamayabilir yada yanlis olabilir
     */
        String[] harfler= {"Y", "B", "D", "G", "O","A"};
        String arananHarf="Y";
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));
        // binarySearch bize aradigimiz elemanin index'ini dondurur
        // array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        // emin olmak icin once sort yapmaliyiz
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));
    }
}











