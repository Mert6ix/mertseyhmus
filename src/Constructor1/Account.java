package Constructor1;

public class Account {
    public String hesapNo;
    public double bakiye;
    public String isim;
    public String email;
    public String telefonNo;

    public Account(String mert_gokdemir, String s, String mert, String babayaro){
        /*this.hesapNo = "bilgi yok";
        this.bakiye = 0.0;
        this.isim = "bilgi yok";*/

        //System.out.println("kendi yazdigimiz costructor...");
    }
    public Account(String hesapNo,double bakiye,String isim,String email)
    {
        this.isim = isim;
        this.bakiye =bakiye;
        this.hesapNo =hesapNo;
        this.email = email;
    }

    public void bilgilerigoster(){
        System.out.println("hesap no: " + this.hesapNo);
        System.out.println("bakiye: " + this.bakiye);
        System.out.println("isim : " + this.isim);
        System.out.println("email : " + this.email);
        System.out.println("telefon no : " + this.telefonNo);

    }

    public Account(String s) {
    }

    public void parayatir(double miktar){
        setBakiye(getBakiye() + miktar);
        System.out.println("yeni bakiye " + getBakiye());
    }

    public String paracekme(double miktar) {

        if (miktar > 1500) {
            System.out.println("en fazla 1500 cekebilirsiniz...");
        }
        if (bakiye - miktar < 0) {
            System.out.println("yeterli bakiye yok " + bakiye);
        } else {
            bakiye -= miktar;
            System.out.println("yeni bakiye =  " + bakiye);
        }

        return "";
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public double getBakiye() {
        return bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }
}
