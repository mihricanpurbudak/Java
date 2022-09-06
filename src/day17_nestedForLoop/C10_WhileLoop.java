package day17_nestedForLoop;

public class C10_WhileLoop {
    public static void main(String[] args) {

        boolean dogruMu = false;
        int sayi = 10;

        while (!dogruMu) {
            if (sayi > 20) { //sart saglandiginda while loopun condition i false olmali
                System.out.println("Bu islem tamam");
                dogruMu = true;

            } else {//sart saglanmadigi muddetce while loopun kontrol ettigi degisken degismeli
                System.out.println("istenen sart saglanmadi" + sayi);

                sayi++;

            }
        }
    }
}
