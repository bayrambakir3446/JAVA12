package PollymorphismUygulama.Poli;

public class Kus extends Hayvan{
    public Kus(String adi) {
        super(adi);
    }

    @Override
    public void sesCikar() {
        super.sesCikar();
        System.out.println("getAdi()+\" civciv ötuyor\" = " + getAdi() + " civciv ötuyor");
    }
}
