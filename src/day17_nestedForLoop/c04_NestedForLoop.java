package day17_nestedForLoop;

public class c04_NestedForLoop {
    public static void main(String[] args) {


    /*
    verilen inputa gore * lardan olusan bir ucgen olusturun
    ornek input=4 ise
    *
    * *
    * * *
    * * * *
     */

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kac satir olacagini giriniz");

        int input = scan.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println("");  boylede yapilabilir */



int input=5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");

            }
            System.out.println("");
        }


            }
        }
