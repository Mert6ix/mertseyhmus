package mertseyhmus;

import java.util.Scanner;

public class while_donguleri {
    public static void main(String[] args) {

         /*int i = 9;

        while ( i <100 ) {
            System.out.println( "i = " + i);
            i *= 5; */

        /*Scanner scanner = new Scanner(System.in);

        System.out.println( "kafana gore biseyler yaziniz  ...");

        int sayi = scanner.nextInt();

        int faktoryel = 1;

        while ( sayi > 0 ){
            faktoryel *= sayi;
            sayi --;
        }
        System.out.println("faktoryel  =" + faktoryel); */

       /* int i = 0;

        do {
            System.out.println(" i =" + 1);

           i ++;}


        while ( i < 10 ) ; */

        Scanner scanner = new Scanner(System.in);

        System.out.println( "bir sayi giriniz");

        int sayi = scanner.nextInt();

        int toplam = 0;

        do {
                toplam += sayi %10;
                sayi /=10;
            System.out.println("sayi :" +sayi);
        } while ( sayi > 1);

        System.out.println( "sonuc!... " +toplam);


        }
}
