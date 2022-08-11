package mertseyhmus;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class whileOrnek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;

        String Islemler = "1.islem : bakiye ogrenme \n" + "2. islem : Para cekme \n" + "3.islem : para cekme\n"
                + "4. CIKIS ICIN Q YA BASINIZ\n" + "5.Kripto Para Yatirma Islemi" ;
        System.out.println("*******************") ;
        System.out.println(Islemler);
        System.out.println("*******************");

        while (true){

            System.out.println("Islemi Seciniz!");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("prograndab cikiliyor");
                break; }
                else if (islem.equals("1")) {
                    System.out.println("bakiyeniz : " + bakiye );
                }

            else if (islem.equals("2")){

                System.out.println("cekmek istediginiz miktari giriniz : "  );
                int tutar = scanner.nextInt();
                scanner.nextLine();


                if (bakiye - tutar < 0) {
                    System.out.println("yeterli bakiye yok : " + bakiye);

                }
                else {
                        bakiye -= tutar;
                        System.out.println("yeni bakiyeniz :  " + bakiye);
                    }
                }

                else if (islem.equals("3")){

                System.out.println("yatirmak istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar;
                    System.out.println("yeni bakiyeniz : " + bakiye);
            }
                else {
                    System.out.println("gecersiz islem!..");

                }


            }

        }
        }


