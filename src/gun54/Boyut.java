package gun54;

public class Boyut {
   private double yukseklik;
   private double genislik;
    private double derinlik;


    public Boyut(double yukseklik, double genislik, double derinlik) {
        this.yukseklik = yukseklik;
        this.genislik = genislik;
        this.derinlik = derinlik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getDerinlik() {
        return derinlik;
    }

    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;
    }
}
