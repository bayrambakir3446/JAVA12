package gun51.packageA;

public class ClassA {
    public static void main(String[]args ){
        AccessModifiers accessModifiers=new AccessModifiers();
        accessModifiers.defaultMethod();
        accessModifiers.okulNo=34567;


       //accessModifiers.privateToplam(12,5);  // ayni pakette olsak bile private tanimlanmis degere erisemiyoruz
        // ayni pakette olsak bile private tanimlanmis degere erisemiyoruz
        //protected
        accessModifiers.publicMethod();//ayni paket icerisinde oldugumuz dan protected tanimli bir uyeye eerisebiliriz.
        accessModifiers.TCNo=123456789L;//ayni paket icerisinde oldugumuz dan protected tanimli bir uyeye eerisebiliriz.

        // Public
        accessModifiers.publicMethod();
        accessModifiers.name="Public Name";
    }
}
