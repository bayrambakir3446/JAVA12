package SoruAbstraction;

public class TestClass {
    public static void main(String[] args) {
        Kare kare=new Kare(2.4 );
        kare.AlanHesapla();
        kare.schowInfo();
     //   Kare kare2=new Kare();
      //  Kare kare1=new Kare(2,5);
//
//        System.out.println("\"-----------------\" = " + "-----------------");
//        kare1.AlanHesapla();
//        kare1.CevreHesapla();
        Hesaplamalar hesaplamalar=new Hesaplamalar(2) {
            @Override
            public void AlanHesapla() {
                System.out.println("Alan Hesaplandi");

            }

            @Override
            public void CevreHesapla() {

            }
        };
        hesaplamalar.AlanHesapla();
        System.out.println("hesaplamalar.deger2 = " + hesaplamalar.deger1);
    }
}
