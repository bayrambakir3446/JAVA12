package gun48;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student ogr1 = new Student("ahmet", 17, "computer Science"); // construktor araciligi ile bir instance olusturdum ama baska birsey olusturabilecekmiyim
        //ogr1.  bak burada encapsul oldugu icin erisemiyorum  private yaptigim icin . operotoru ile ulasamiyorum
// ogr1 in to stringe ulastigini gorelim
        ogr1.toString();  // bu sekilde to stringden birsey alamazsin
// ama ben yukaridaki to string metodumun calistigini gormek istiyorsam  String tipinde bir result a bu metodu atarsam ona ulasirim
        String result = ogr1.toString();
        System.out.println(result);
        // konsola bak neler getirmis to
        // hatta ogr1 i de tanimladiktan sonra yazdiradabilirdik
        System.out.println(ogr1);

ogr1.setName("  ali");
      //  ogr1.isimDuzenle("mehmet"); // konstr dan aldigim veriyle bir metod yazdim ve atadim ismi mehmet diye asagida yazdirdim
        System.out.println(ogr1);

// asagida bos konstruktor a bakiyorum default degerleri gorecem
        Student ogr3=new Student();
        System.out.println(ogr3);// bu sekilde yazdirirsak sonucu goruruz
        //+ buraya artik setterlarla veri atamasi yaparsam daha kontrollu olacaktir
        ogr3.setName("mehmet");
        ogr3.setAge(34);
        ogr3.setDivision("math");
        System.out.println(ogr3);
Student ogr4=new Student();
        Scanner scan =new Scanner(System.in);
        System.out.println("ogrenci adini giriniz");
        ogr4.setName(scan.nextLine());
        System.out.println("ogrencinin yasini giriniz");
        ogr4.setAge(scan.nextInt());
        System.out.println(ogr4);




    }
}
