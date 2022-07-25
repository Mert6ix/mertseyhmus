package UDEMY1;

import java.util.Scanner;

public class mini_proje_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci sayi  :  ");
        int a = scanner.nextInt();
        System.out.println("ikinci sayi  :  ");
        int b = scanner.nextInt();
        System.out.println("3.sayi  : ");
        int c = scanner.nextInt();


        int maks = -1;

        if (a >= b && a >= c) {

            maks= a;
        } else if (b>=a && b>=c) {
            maks = b;

        }

        else {
            maks = c;
        }

        System.out.println("maksimum sayi  :  " +maks);


    }
}
