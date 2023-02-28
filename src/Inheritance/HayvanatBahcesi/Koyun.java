package Inheritance.HayvanatBahcesi;

public class Koyun extends Hayvan {
    public String renk;
    public void kirp(){
        System.out.println("kirpiliyor");
    }

    @Override
    public void yemekVer() {
        System.out.println("ot verildi");
    }
}
