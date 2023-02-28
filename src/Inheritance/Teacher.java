package Inheritance;

public class Teacher extends Kullanici {
//    public String kullaniciAdi;
//    public String sifre;
    public int ogretmenNo;
    public double puan;
    public int bakiye;
//    public void girisYap(String kullaniciAdi,String sifre){
//        if (kullaniciAdi.equals("admin")&&sifre.equals("123456")){
//            System.out.println("giris basarili");
//
//        } else {
//            System.out.println("giris basarisiz");
//        }
//
//    }
//    public void mesajGonder(){
//        System.out.println("meaj gonderildi");
//    }
    public void ogrencileriListele(){
        System.out.println("ogrenciler listelendi");
    }
    public void paraCek(int miktar){
        this.bakiye=this.bakiye-miktar;
        System.out.println("para cekildi=" +this.bakiye);


    }
}
