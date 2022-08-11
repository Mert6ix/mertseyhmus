package METODLAR;

public class Metodlar_Overloading {
    public static void skorhesapla(String isim,int puan){
        System.out.println(isim + "adli oyuncunun " + puan + " puani var");
    }
    public static void skorhesapla(int puan){
        System.out.println("isimsiz oyuncunun " + puan + " puani var ");
    }
    public static void skorhesapla(String isim){
        System.out.println(isim + " adli oyuncun hic puani yok.");
    }
    public static void main(String[] args) {

    skorhesapla("murat ",1000);
    skorhesapla("mehmet");
    skorhesapla(1500);

    }
}
