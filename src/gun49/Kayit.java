package gun49;

public class Kayit {
    static String name;
    static String nachname;
    String adress;
    int old;
    boolean hause;

    public Kayit(String name, String nachname, String adress, int old, boolean hause) {
        this.name = name;
        this.nachname = nachname;
        this.adress = adress;
        this.old = old;
        this.hause = hause;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public boolean isHause() {
        return hause;
    }

    public void setHause(boolean hause) {
        this.hause = hause;
    }
}
