package mertseyhmus;

import java.util.Scanner;

public class breakNcontinue {
    public static void main(String[] args) {

        /*int i = 0;

        while ( i < 20 ) {
            if ( i == 10) {
                break;
            }
            System.out.println("i = " + i);
            i++;
        }*/

       /* Scanner scanner = new Scanner(System.in);
         while (true) {
             int islem = scanner.nextInt();
             if (islem == 10) {
                 System.out.println("donguden cikiliyor.... ..");
                 break;
         }
             System.out.println("islem : "  + islem);
    }*/
        int i = 0;

        while ( i< 104 ) {
            if (i == 33 || i == 56 || i ==100){

                continue;
            }
            System.out.println("i =" + i);
            i++;
        }


    } }
