package UDEMY1;

import java.util.Scanner;

public class hipotenus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        System.out.println("birinci kenar :  ");
        a = scanner.nextInt();
        System.out.println("ikinci kenar :  ");
        b = scanner.nextInt();

        double h = Math.sqrt(a * a + b * b);

        System.out.println("hipotenus :  "  +h);







    }
}
