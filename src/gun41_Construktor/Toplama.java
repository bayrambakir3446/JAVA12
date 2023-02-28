package gun41_Construktor;

public class Toplama {
    int a;
    int b;
    int m;
    int toplam;

    public Toplama() {
    }

    public Toplama(int a, int b, int toplam) {
        this.a = a;
        this.b = b;
        this.toplam = toplam;
    }
    public Toplama(int a){
        this.m=a;
    }
}
