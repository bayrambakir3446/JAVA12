package gun56Sekiller;

public class Kare extends Sekil{

    // burada abstract klasin altinda concreate class olmasi icin kurallari uygulamalidir.  yani sekildeki olayi implement etmek gerekir

    @Override
    public void ciz() {

    }

    @Override
    public void ciz(int a, int b, int c) {
        //burada implemetasyonu yaptigi icin badili
        System.out.println("kare ciziyor");
    }

    //klass duzeyinde kontrol sagliyor
}
