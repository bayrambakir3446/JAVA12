package gun45statik;

public class Urun {
    String urunAdi;
    double birimFiyati;
    double miktar;
    String kategori;
    double toplamFiyat;
    //simdi ben burada markete gidip urun adi, birim fiyati miktari ve kategoriyi veren bir konsraktir olusturuyorum
    //ben urunleri aldikca fiyat hesaplayan bir metod yazacagim

    public Urun(String urunAdi, double birimFiyati, double miktar, String kategori) {
        this.urunAdi = urunAdi;
        this.birimFiyati = birimFiyati;
        this.miktar = miktar;
        this.kategori = kategori;
    }
    public double getToplamFiyat(){
        this.toplamFiyat=birimFiyati*miktar;
        return toplamFiyat;
    }

    @Override
    public String toString() {
        String str="";
        str+=urunAdi+"         "+birimFiyati+" tl "+"          "+ miktar+ " "+"kg"+"              " + kategori;
        return str;
    }

    public static void main(String[] args) {
        Urun urun1=new Urun("Elma",2,3,"kabzimal"); //burada goruyorum dogru calisip calismadigini
        System.out.println("urun1 = " + urun1);
    }
}
