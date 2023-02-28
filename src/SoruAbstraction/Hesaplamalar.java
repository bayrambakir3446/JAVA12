package SoruAbstraction;

public abstract class Hesaplamalar {

    double deger1;
    double deger2;
    final double Pi = 3.14;

    public Hesaplamalar(double deger1) {
        this.deger1 = deger1;
    }

    public Hesaplamalar(double deger1, double deger2) {
        this.deger1 = deger1;
        this.deger2 = deger2;
    }


    public abstract void AlanHesapla();

    public abstract void CevreHesapla();

    public void schowInfo() {
        System.out.println("deger1 = " + deger1);
        System.out.println("deger2 = " + deger2);


    }

}
