package PollymorphismUygulama.Poli;

public class Köpek extends Hayvan{

    public Köpek(String adi) {
        super(adi);
    }

    @Override
    public void sesCikar() {
        super.sesCikar();
        System.out.println("getAdi()+\" havliyor\" = " + getAdi() + " havliyor");
    }
}
