package gun48;

public class Review {
    public String name;//instance variable
    public static int number;
    public void nonStaticMethod(){
        System.out.println("\"non static method\" = " + "non static method");
        System.out.println(name);// bakin burada ulasildi yani burasi instance method
        this.name="deneme";
    }

    public  static void print(){
        System.out.println("Printing some info..");
       // System.out.println(name); static olmayan bir conteks statik bir kontex icerisinde eerisilemez
        //nonStaticMethod() bu methodu cagirsak yine ulasilmaz  bunlar riview classindan bir obje olusturdugumuz zaman hayata gececeklerdir
        Review rw=new Review();// artik buradaki rw degiskeninni kullanarak ulasabiliriz
        System.out.println("rw.name = " + rw.name);// bak artik ulasabildim
        rw.nonStaticMethod();// bak artik ulasabildim
       // this.name="deneme"; static ve super static yapilarda kullanilamaz
    }

    public static void main(String[] args) {
        System.out.println("\"review-static members and encapsulation in java\" = " + "review-static members and encapsulation in java");
        //nonStaticMethod() bu nonstatic method buradada calismayacaktir yani static olmayan yaapilara dogrudan erisemeyecektir
        //ancak review denilen klassdan instance olusturursak(yani obje olusturursak ancak o zaman ulasacaktir
        print();// dogrudan instance metodu kullanmadan bak nasil da ulasiliyor
        // yani static yapilar bir baska static yapi icerisinden dogrudan cagrilabilir

        //sindi bizim su soruya cevap vermemiz gerekiyor kim once calisir
        //ilk calisacak blok statik
        // sonra main method icerisinde yazacagi ne varsa onu yaziyor
        // sonra main de bir new ile instance olusturdu. iste tam bu sirada gider non-static blogu calistiracak
        // sonra sira olarak main method icerisindeki bilgileri yazmaya devam ediyor
        //sonra main icerisinde non static metodunu cagirmistik oradan aldigi referansla non-static metodun icerisine gidecektir
        // daha sonra print metodu cagirilmis buradan aldigi referansla print metoduna gicek onun icerisindeki siralamaya gore islemini yapacak
        //yalniz baktigimiz zaman oradada bir instance olusturmus hemen yine non statik blok calisacaktir
        //ve bu sekilde siralama devam edecektir
        //
        //


    }
    static  {
        System.out.println("\"iste bak static blok\" = " + "iste bak static blok");
    }
    {
        System.out.println("\"ahanda burasi on static blok\" = " + "ahanda burasi on static blok");
    }
}
