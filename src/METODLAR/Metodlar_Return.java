package METODLAR;

public class Metodlar_Return {
    public static int ikicarp(int a){
        return a*2;
    }
    public static int ikitopla(int a){
        return a + 2;
    }
    public static int dortcarp(int a){

        return a * 4;
    }
    public static void main(String[] args) {
        System.out.println("sonuc  " + ikicarp(ikitopla(dortcarp(3))));

    }
}
