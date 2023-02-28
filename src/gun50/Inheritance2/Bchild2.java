package gun50.Inheritance2;

public class Bchild2 extends AParent2{
    String name;
    Bchild2(){
        super();
        System.out.println("ben child klass construkuruyum");
    }
Bchild2(String name){
        this(); //super();  bunu demek istiyorum asagidaki aciklamayla
        this.name=name;
//super ve this ikisi beraber ayni constructor icinde olmaz ikiside ilk sirada olmasi gerekiyor o yuzden cagiramazsiniz

}
// child klass da bir nesneden ulasabilirim bir de klass in kendi icerisinden ulasabilirim
    public void aMEthodChild(){
        //ben simdi eger ust classdaki degiskenlere ulasacaksam
        super.parerntField="Assigment from child class";
        super.parentFieldInt=14;
       //  super.  ben buradan private bir degiskene ulasamiyorum bunun icin set ve get olusturmam gerekiyor
    super.setPrivateStr("sub classsdan set yaptim yolu kurdum get metoduyla doktururum artik");

    }
}
