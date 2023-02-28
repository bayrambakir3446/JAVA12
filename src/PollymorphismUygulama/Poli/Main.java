package PollymorphismUygulama.Poli;

public class Main {

    public static void hayvaniKonustur(Hayvan hayvan){
        hayvan.sesCikar();
    }
    public static void main(String[] args) {
        Hayvan hayvan=new Hayvan("tekir");
        System.out.println("hayvan.getAdi() = " + hayvan.getAdi());
        Kedi kedi1=new Kedi("felix");
        System.out.println("kedi1.getAdi() = " + kedi1.getAdi());
        hayvan.sesCikar();
        kedi1.sesCikar();
        Kus kus=new Kus("twity");
        kus.sesCikar();
        Köpek köpek=new Köpek("karabas");

    }

}
