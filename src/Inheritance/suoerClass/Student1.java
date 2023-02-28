package Inheritance.suoerClass;

public class Student1 extends Kullanici1 {
    private int kursSayisi;

    public Student1(String kullaniciadi, String sifre, int kursSayisi) {
        super(kullaniciadi, sifre);
        this.kursSayisi = kursSayisi;
    }

    public int getKursSayisi() {
        return kursSayisi;
    }

    public void setKursSayisi(int kursSayisi) {
        this.kursSayisi = kursSayisi;
    }

    public void puanVer(){
        System.out.println("puan verildi");
    }
}
