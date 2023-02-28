package Inheritance.suoerClass;

public class Kullanici1 {
    private String kullaniciadi;
    private String sifre;

    public Kullanici1(String kullaniciadi, String sifre) {
        this.kullaniciadi = kullaniciadi;
        this.sifre = sifre;
        if (kullaniciadi.equals("admin")&&sifre.equals("123456")){
            System.out.println("giris basarili");

        } else {
            System.out.println("giris basarisiz");
        }
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }


}
