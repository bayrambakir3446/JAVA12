package gun50.Inheritance2;

public class AParent2 {
    String parerntField;// super anahtar kelimesini test icin olusturuyorum
    int parentFieldInt;
    private String privateStr;

    public String getPrivateStr() {
        return privateStr;
    }

    public void setPrivateStr(String privateStr) {
        this.privateStr = privateStr;
    }

    AParent2 (){
        System.out.println("ben default konstrukturum");
    }
    public void aMethod(){
        System.out.println("ben bir methodum super/parent class da");
    }
}
