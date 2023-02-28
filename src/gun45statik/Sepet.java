package gun45statik;

import java.util.ArrayList;

public class Sepet {
    //ilk once urunlerin clasindan const. ve to stringle yapiyi kurdum ekstra olarak orada main metodla calisip calismadigini kontrol ettim
ArrayList<Urun>urunler=new ArrayList<>();
double urunlerToplamFiyat;// sepeti olusturmusken urunler toplam fiyatina ihtiyacimiz olacak

    Sepet() {
        this.urunler = new ArrayList<>(); // konst. bize yeni bos urunler listesi olustursun
    }
    public void sepeteEkle(Urun urun){
        this.urunler.add(urun); //bu sekilde sepata eklememi yapiyorum


    } public double sepetToplamFiyat(){
        for (Urun urun:this.urunler){
            this.urunlerToplamFiyat+=urun.getToplamFiyat();
        }
    return urunlerToplamFiyat;
    }

    @Override
    public String toString() {
        String str="";
        str+="Uruunun adi      Birim FIyati    Miktari    Toplam Fiyati   Kategori \n";
        str+="-----------      ------------    -------    -------------   ----------\n";
        int srNo=1;
        for (Urun urun:urunler){
            str+=srNo++ +"-\t"+urun+ "\n";
        }
        str+="\n               Urunlerin TOplam Fiyati = " +sepetToplamFiyat();
        return str;
    }// simdi markete gidelim bunlari okutalim
}
