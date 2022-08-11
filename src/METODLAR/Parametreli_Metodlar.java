package METODLAR;

public class Parametreli_Metodlar {
    public static void toplama(int a,int b, int c){
        System.out.println("toplamlari = " + (a + b + c ));
    }
    public static void selamlama(String isim){
        System.out.println("selamlama..." + isim);
    }
    public static void main(String[] args) {
    selamlama("murat");
    selamlama("ayse");
    toplama(45,55,78);
    }
}
