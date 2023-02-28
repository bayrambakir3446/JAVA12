package Inheritance.suoerClass;

public class Teacher1 extends Kullanici1{
    private int ogretmenNo;
    private double puan;
    private int bakiye;

    public Teacher1(String kullaniciadi, String sifre, int ogretmenNo, double puan, int bakiye) {
        super(kullaniciadi, sifre);
        this.ogretmenNo = ogretmenNo;
        this.puan = puan;
        this.bakiye = bakiye;
    }

    public int getOgretmenNo() {
        return ogretmenNo;
    }

    public void setOgretmenNo(int ogretmenNo) {
        this.ogretmenNo = ogretmenNo;
    }

    public double getPuan() {
        return puan;
    }

    public void setPuan(double puan) {
        this.puan = puan;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}

