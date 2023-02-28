package gun44Static.hesapMk;

public class HesapMakinesi {
    static double sonuc;

    static void topla(int num1,int num2){    //eger ki bu statik memberimizi public olarak tanimlarsak butun ptoje icinden dirak olarak ulasabiliriz
        sonuc=0;
        sonuc=num1+num2;
        System.out.println("sonuc = " + sonuc);


    }
    public static void topla(int... sayi){  // Var args  degisen sayida arguman
      //  System.out.println("HesapMakinesi.sonuc = " + HesapMakinesi.sonuc);
        sonuc=0;  // eger ben buralara sonucu 0 olarak atamazsam yukaridaki metodla asagidaki metodu toplam a ekliyor
        System.out.println(sayi.length);
        for (int i=0;i<sayi.length;i++){
            System.out.println("sayi[i] = " + sayi[i]);
            sonuc+=sayi[i];
        }
       System.out.println("sonuc = " + sonuc);

    }
}
