package Inheritance.HayvanatBahcesi;

public class At extends Hayvan{
    public double bacakBoyu;
    public int hiz;

    public void nalDegistir(){
        System.out.println("nal degisti");
    }
    public void egitimVer(){
        System.out.println("egitim verildi");
    }

    @Override
    public void yemekVer() {
        System.out.println("yulaf verildi");
    }
}
