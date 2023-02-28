package SoruAbstraction;

public class Kare extends Hesaplamalar{

    public Kare(double deger1) {
        super(deger1);
    }

   // public Kare(double deger1, double deger2) {
   //     super(deger1, deger2);
   // }

    @Override
    public void AlanHesapla() {
        double AlanKare=deger1*deger1;
        System.out.println("AlanKare = " + AlanKare);

    }

    @Override
    public void CevreHesapla() {
        double cevreKare=4*deger1;
        System.out.println("cevreKare = " + cevreKare);

    }


}
