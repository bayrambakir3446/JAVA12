package gun50.Inheritance2;

public class InharitanceTest2 {
    public static void main(String[] args) {
        AParent2 aparent2=new AParent2();
        Bchild2 bchild2=new Bchild2();
        Bchild2 bchild21=new Bchild2("ali Baba");
        System.out.println("bchild21.name = " + bchild21.name);//seklindede okutabilirim
        bchild2.setPrivateStr("ben burayi parent clasda degiskenini string olusturdum(kurdum yani) asagida ise get ile yazdirmasini yapiyorum");
       System.out.println("bchild2.getPrivateStr() = " + bchild2.getPrivateStr());// burada ana klasdaki veriye ulastim .asgida metodu cagirirsam child klasdaki veriyi miras almuis olacagim bakalim ne olacak
   bchild2.aMEthodChild();
        System.out.println("bchild2.getPrivateStr() = " + bchild2.getPrivateStr());

    }
}
