package UDEMY1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nereye Ucmak istersiniz? ");

        String yer = scanner.next();

        String A = "paris";

        String B = "Istanbul";

        double abc = 134 * 2.11;


        System.out.println("bilet fiyatiniz : " + abc   );
    }
}
