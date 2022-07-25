package UDEMY1;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplam_gol;
        int toplam_assist;

        System.out.println("toplam gol :   ");
        toplam_gol = scanner.nextInt();

        System.out.println("toplam assist :  ");
        toplam_assist = scanner.nextInt();

        System.out.println( "Degistirilmeden once.....");

        System.out.println("toplam gol :  "  +  toplam_gol + " toplam assist  :  "  + toplam_assist);


        int averaj = toplam_gol;

        toplam_gol = toplam_assist;

        toplam_assist = averaj;

        System.out.println("degistirildikten sonra....");

        System.out.println("toplam gol :  "  +  toplam_gol + " toplam assist  :  "  + toplam_assist);







    }
}
