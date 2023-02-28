package SoruAbstraction;

public class Dikdortgen extends Hesaplamalar{


    public Dikdortgen(double deger1, double deger2) {
        super(deger1, deger2);
    }

    @Override
    public void AlanHesapla() {
        double dikdortgenAlan=deger1*deger2;
        System.out.println("dikdortgenAlan = " + dikdortgenAlan);

    }

    @Override
    public void CevreHesapla() {
        double dikdortgenCevre=2*(deger2+deger1);
        System.out.println("dikdortgenCevre = " + dikdortgenCevre);

    }
}
