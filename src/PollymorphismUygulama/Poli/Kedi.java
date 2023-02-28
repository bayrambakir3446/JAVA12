package PollymorphismUygulama.Poli;

public class Kedi extends Hayvan{
    public Kedi(String adi) {
        super(adi);
    }

    @Override
    public void sesCikar() {
        System.out.println("getAdi() + \"miyavliyor\" = " + getAdi() + "miyavliyor");

    }
}
