package METODLAR;

import java.util.Scanner;

public class Metodlar_1 {
    public static void selamlama(){
        System.out.println("merhaba nasilsiniz...");
        System.out.println("selamlar.. ..");
    }
    public static void faktoryel(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz...");
        int sayi = scanner.nextInt();
        int faktoryel = 1;
        while (sayi>0) {

            faktoryel *= sayi;
            sayi--;
        }
        System.out.println("faktoriyel =" +faktoryel);

        }

    public static void main(String[] args) {

        selamlama();
        selamlama();

        faktoryel();
        selamlama();
        faktoryel();
    }
}
