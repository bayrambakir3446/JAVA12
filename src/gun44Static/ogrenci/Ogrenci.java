package gun44Static.ogrenci;

public class Ogrenci {
    static int okulNo=1000;
    int ogrnciNo;
    String adi;
  final   static String okulAdi="EuroTech";
    final static String okulAdresi="Almanya";

    public Ogrenci( String adi ) {
        okulNo++;
        this.ogrnciNo = okulNo;
        this.adi = adi;
        //this.okulAdi = okulAdi;
        //this.okulAdresi = okulAdresi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "Ögrenci NO=" + ogrnciNo +
                ", adi='" + adi + '\'' +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }
}
