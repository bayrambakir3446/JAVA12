package gun44Static.hesapMk;

import gun44Static.hesapMk.HesapMakinesi;

public class HesapMakinesiTest {
    public static void main(String[] args) {
//        HesapMakinesi hsp1=new HesapMakinesi();  // biz normal metotlarda bunu yapiyorduk
//        hsp1.topla(5,6);
//        System.out.println("hsp1.sonuc = " + hsp1.sonuc); statigi ogrendikden sonra bu sekilde instance olusturup metot cagirmak cok sacm
//        bunun yerine avanin static de direk kopyasini aldigi icin o sekilde yapabiliriz

        HesapMakinesi.topla(5, 6);  //cassin Statik member e

        System.out.println("\"neden iki yaziyo\" = " + "neden iki yaziyo");

        System.out.println("HesapMakinesi.sonuc = " + HesapMakinesi.sonuc); //ve klass in ismiylede sonuca ulasabiliyoruz ulastik

        HesapMakinesi.topla(2, 4, 5, 6, 7, 8, 9, 0); //bana zaten metodun icinde ne istemissem veriyo
        System.out.println("HesapMakinesi.sonuc = " + HesapMakinesi.sonuc); //özel olarak metoddan sadece sonucu cagiririm


    }
}
