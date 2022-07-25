package mertseyhmus;

import java.util.Scanner;

public class FOR_DONGULERI {
    public static void main(String[] args) {

       /* int i = 0;
        int j = 10;
        for (; i <10 && j >0 ; i++,j--) {
            System.out.println("i=" +i);
            System.out.println("j= " +j); */

       /* for (int i = 3 ; i < 999 ; i *=4 ) {
            System.out.println( "i = " + i);
        }
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayi giriniz lutfen lan.. .");

        int a = 1;

        int sayi = scanner.nextInt();

        for ( int i = 1 ; i <= sayi ; i++){
            a *= i;

        }

        System.out.println("faktoryerl   :" +a);




    }
}
