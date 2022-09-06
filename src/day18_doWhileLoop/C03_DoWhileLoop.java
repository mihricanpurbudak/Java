package day18_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /* While loop da once kontrol edip sonra islem yaptigimiz i
        cin islem bittikten sonra loop un kirilmasi ocin
        bir kez daha basa donmemiz gerekiyor
        bu durumda fazladan bir islem yapiliyor */

        int sayi = 7;

        while (sayi < 10) {
            System.out.println(sayi);

            sayi++;
        }
        // do_while loop ile calistigimizda bu dezavantaj ortadan kalkar

        sayi = 7;
        do {

            System.out.println(sayi);
            ;

            sayi++;
        } while (sayi < 10);
    }
}









