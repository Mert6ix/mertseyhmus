package mertseyhmus;

import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        String sys_kullanici_adi="mert";
        String sys_parola ="12345";

        System.out.println("***************");
        System.out.println("Kullanici Girisine Hosgeldiniz...");
        System.out.println("**********");

        while (true){
            System.out.println("kullanici adi : ");
            String kullanici = scanner.nextLine();
            System.out.println("parola : ");
            String parola = scanner.nextLine();
            if (sys_kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("hosgeldiniz  ,,,.." + kullanici);
                break;
            } else if (sys_kullanici_adi.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {

                System.out.println("parolaniz yanlistir...");
                giris_hakki -= -1;
            }

            else if (!sys_kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {

                System.out.println("kullanici adiniz yanlistir...");
                giris_hakki -= -1;
            }

            else   {

                System.out.println("kullanici adiniz ve parolaniz yanlistir...");
                giris_hakki -= -1;

            }
            if (giris_hakki == 0) {
                System.out.println("giris hakkiniz bitmistir tekrar bekleriz....!");
                break;
            }






        }
    }
}
