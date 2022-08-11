package Constructor2test;

import java.util.Scanner;

public class ATM {



    public void calis(hesap hesap) {

        login  login = new login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("bankamiza hosgeldiniz!");

        System.out.println("*******************");
        System.out.println("kullanci girisi");
        System.out.println("*******************");
        int giris_hakki = 3;

        while (true){

            if (login.login(hesap)){
                System.out.println("giris basarili");
                break;
            }else {
                System.out.println("giris basarizi..");
                giris_hakki=-1;
                System.out.println("kalan giris hakki" + giris_hakki);
            } if (giris_hakki == 0){
                System.out.println("giris hakkiniz bitti!");
                return;
            }
        }

        System.out.println("**********************");
        String islemler = "1.bakiye goruntule\n"
                + "2.para yatirma \n"
                + "3.para cekme \n"
                + "cikis icin q ye basin";
        System.out.println(islemler);
        System.out.println("**********************");

        while (true){

            System.out.println("islem seciniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                break;
            } else if (islem.equals("1")) {
                System.out.println("bakiyeniz : " + hesap.getBakiye());

            } else if (islem.equals("2")) {
                System.out.println("yatirmak istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextInt();
                hesap.paraYatir(tutar);

            } else if (islem.equals("3")) {
                System.out.println("cekmek istediginiz miktar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);

            }else {
                System.out.println("gecersiz islem");
            }
        }
    }
}
