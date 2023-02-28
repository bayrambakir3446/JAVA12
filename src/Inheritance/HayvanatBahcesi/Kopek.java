package Inheritance.HayvanatBahcesi;

public class Kopek extends Hayvan {
    public void yuruyusYap()
    {
        System.out.println("yuruyus yapildi");
    }
    public void egitimVer(){
        System.out.println("egitim verildi");
    }

    @Override
    public void asiYap() {
        super.asiYap();
        System.out.println("Kuduz asisi da yapildi");
    }

    @Override
    public void yemekVer() {
        System.out.println("et verildi");
    }
}
