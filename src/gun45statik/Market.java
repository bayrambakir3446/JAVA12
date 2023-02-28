package gun45statik;

import java.util.Date;

public class Market {
    public static void main(String[] args) {
        //simdi burada hem urunu hem de sepeti kontrol edecegim
        System.out.println("HerzlichWillkommen");
        Urun urun1=new Urun("elma",5,2,"kabzimal");
        Urun urun2=new Urun("peynir",5,2,"essen");
        Urun urun3=new Urun("deterjan",5,2,"dorigeri");
        Urun urun4=new Urun("ekmek",5,2,"backer");
    Sepet sepet=new Sepet();
    sepet.sepeteEkle(urun1);
    sepet.sepeteEkle(urun2);
    sepet.sepeteEkle(urun3);
    sepet.sepeteEkle(urun4);
      //  System.out.println(sepet);
        Fatura fatura=new Fatura(new Date(),sepet);
        System.out.println(fatura);
    }

}
