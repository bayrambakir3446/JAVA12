package Inheritance;

public class Kullanici {
    public String kullaniciAdi;
    public String sifre;

    public void girisYap(String kullaniciAdi,String sifre){
        if (kullaniciAdi.equals("admin")&&sifre.equals("123456")){
            System.out.println("giris basarili");

        } else {
            System.out.println("giris basarisiz");
        }

    }
    public void mesajGonder(){
        System.out.println("meaj gonderildi");
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.kullaniciAdi="admin";
        student.sifre="123456";
        student.puanVer();
        student.mesajGonder();
        student.girisYap("admin","123456");
        //bunun aynisini ogretmen icinde yapabiliriz
        Teacher teacher=new Teacher();
        teacher.kullaniciAdi="ahmet";
        teacher.sifre="12345";
        teacher.bakiye=300;
        teacher.girisYap("ahmet","1234");

        //inheritance ile bu sekilde istedigim seyleri yazmis oldum istedigim gibi degistirebilirim


    }
}
