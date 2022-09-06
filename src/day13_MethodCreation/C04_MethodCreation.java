package day13_MethodCreation;

public class C04_MethodCreation {

    public static void main(String[] args) {

        //Input olarak verilen 2 int.toplayip sonucu yazdiran bir method yazdirin.

        int input1 = 30;
        int input2 = 20;

        //method 4 adimda olusturulur
        //1.adim method call
        //2.adim argument eklenmesi gerekiyorsa ekleyelim
        //eger methodun return Typi void den farkli olacaksa
        //bir variable olusturup,method call i assign edelim

        topla(input1, input2);

    }
    public static void topla(int input1,int input2){
        //3.adim method deklarasyonunda degistirilmesi gereken bolumleri
        // degistirir(acces modifier ,return Type vb)
        // return keyword u ve donecek degeri hesaplamaliyiz

        System.out.println("Girilen iki sayinin toplami:"+(input1+input2));

    }
}