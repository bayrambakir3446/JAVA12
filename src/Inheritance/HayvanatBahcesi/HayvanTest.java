package Inheritance.HayvanatBahcesi;

public class HayvanTest {
    public static void main(String[] args) {
        Kopek kopek=new Kopek();
        kopek.id=5;
        Koyun koyun =new Koyun();
        koyun.isim="kinali";
        At at=new At();
        at.hiz=45;
at.yemekVer();
kopek.yemekVer();
koyun.yemekVer();
kopek.asiYap();
        System.out.println("------------------------------");
koyun.asiYap();
    }

}

