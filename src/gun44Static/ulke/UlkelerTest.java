package gun44Static.ulke;

import gun44Static.ulke.Ulkeler;

public class UlkelerTest {
    public static void main(String[] args) {
        System.out.println(Ulkeler.ulkelerSayac);
        Ulkeler ulke1=new Ulkeler("Turkiye","TR",90);
        System.out.println(Ulkeler.ulkelerSayac);
        Ulkeler ulke2=new Ulkeler("Almanya","DE",49);
        Ulkeler ulke3=new Ulkeler("Amerika","ABD",01);
        System.out.println(ulke1);
        System.out.println(ulke3);
        System.out.println(ulke2);
        System.out.println(Ulkeler.ulkelerSayac);
        Ulkeler ulke4=new Ulkeler("Ingiltere","GB",48);
        System.out.println(ulke4);
    }
}
