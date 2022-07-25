package UDEMY1;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int islem = scanner.nextInt();

        switch (islem){
            case 1:
                System.out.println("1.islem");

            case 2:
                System.out.println("3.islem");


            case 3:


                System.out.println("4.islem");
            case 4:

                System.out.println("8392.islem  ." );

                break;



            default:
                System.out.println( "gecersiz!!1");

        }
    }
}
