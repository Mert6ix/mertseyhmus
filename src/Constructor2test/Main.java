package Constructor2test;

public class Main {
    public static void main(String[] args) {


    ATM atm = new ATM();{

        hesap hesap = new hesap("mert","12345",8000);

        atm.calis(hesap);
        System.out.println("programdan cikiliyor...");

    }


}}
