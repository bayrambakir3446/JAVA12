package gun41_Construktor;

public class ToplamTest {
    public static void main(String[] args) {
        Toplama toplama=new Toplama();
        toplama.a=2;
        toplama.b=3;
        toplama.toplam=toplama.a+ toplama.b;
        System.out.println(toplama.toplam);
        Toplama toplama1=new Toplama(9);
        toplama1.b=2;
        toplama1.toplam= toplama1.m+ toplama1.b;
        System.out.println(toplama1.toplam);

    }
}
