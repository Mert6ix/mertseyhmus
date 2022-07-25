package UDEMY1;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen yasinizi girin   :  ");

        int yas = scanner.nextInt();

        if (yas < 12) {

            System.out.println("bu mekana giremezsiniz !!!");
        }
        else if ( yas >= 71) {

            System.out.println("DAYI OLECEN SIKTIR GIT");
        } else if (yas > 21) {

            System.out.println( "mekana gidebilirsin....");
        }
        else {
            System.out.println("sende problem var dayi");
        }

    }
        {


    }
}
