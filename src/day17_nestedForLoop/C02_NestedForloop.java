package day17_nestedForLoop;

public class C02_NestedForloop {

    //verilen sayiya gore carpim tablosu olusturun
    /* input  3
    1 2 3
    2 4 6
    3 6 9

     */

    public static void main(String[] args) {

       int input=4;
        for (int i = 1; i <=input ; i++) {

            for (int J=1; J<=input; J++){
                System.out.print(i*J + " ");
            }
            System.out.println("");

        }
    }
}
