package SoruAbstraction;

public class Cember extends Hesaplamalar{


    public Cember(double deger1, double deger2) {
        super(deger1, deger2);
    }

    @Override
    public void AlanHesapla() {
        double DaireAlan=this.Pi*deger1*deger1;
        System.out.println("DaireAlan = " + DaireAlan);
    }

    @Override
    public void CevreHesapla() {
        double cemberCevre=2*this.Pi*deger1;
        System.out.println("cemberCevre = " + cemberCevre);
    }
}
