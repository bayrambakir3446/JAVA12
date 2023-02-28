package gun51.packageA;

public class AccessModifiers {

    private int id;
    protected long TCNo;
    public String name;
    int okulNo;
    private void privateToplama(int sayiA, int sayiB){
        System.out.println("Toplam = " +( sayiA + sayiB));
    }  void defaultMethod(){
        System.out.println("I am a default method");
    }
    protected void protectedMethod(){
        System.out.println("I am a protected method.");

    }
    public void publicMethod(){
        System.out.println("I am a public method.");}

    public static void main(String[] args) {
        System.out.println("Access modifiers in Java.");
        AccessModifiers accessModifiers=new AccessModifiers();// olusturmus oldugum instance sebewbiyle engellemeleri kaldirdim
        accessModifiers.id=10; // Private tanimlamasina ragmen erisbildim
        accessModifiers.name="EuroStudy";// public tanimlandigindan en genis gorunurluge  sahip ve her class tan erisebiliriz.
        accessModifiers.okulNo=1234; // default tanimi geregi ayni class ve ayni paket icerisinden erisebiliriz.
        accessModifiers.TCNo=12345678910L;// protected tanimlamsi ile belirlendigi icin ayni class ,aynii paket veya farkli paket
                                          //miras iliskisi olan baska bir class icerisinden erisebiliriz.
        //ayni class icersinden cagirdigimiz butun metodlara herhangi bir access modifier kisitlamasi olmaksizin erisebiliriz.
        accessModifiers.privateToplama(23,2);
        accessModifiers.defaultMethod();
        accessModifiers.protectedMethod();
        accessModifiers.publicMethod();

    }
}
