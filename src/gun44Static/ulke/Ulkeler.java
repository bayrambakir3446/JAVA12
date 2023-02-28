package gun44Static.ulke;

public class Ulkeler {
    static int ulkelerSayac;  // bu kisim statik variable
    int dummyCounter; //instance variable
    String name;     //instance variable

    String ulkeKod; //instance variable
    int intTelCode;
    public Ulkeler(String name, String ulkeKod, int intTelCode) {
       ulkelerSayac++;
       dummyCounter++;
        this.name = name;
        this.ulkeKod = ulkeKod;
        this.intTelCode = intTelCode;
    }

    @Override
    public String toString() {
        return "Ulkeler{" +
                "dummyCounter=" + dummyCounter +
                ", name='" + name + '\'' +
                ", ulkeKod='" + ulkeKod + '\'' +
                ", intTelCode=" + intTelCode +
                '}';
    }
}
