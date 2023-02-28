package gun56Sekiller;

public  abstract class Sekil {

    // konsept acisindan cati klass anliyor

    public abstract void ciz();  //abstract metodda herhangi bir badi yok . eger badili bir metod ttanimlamyamayiz
    public abstract void ciz(int a,int b,int c); // bunlar eylemin ne olacagini belirliyor ama implemetasyona karismiyor
    //burada kurallari belirliyoruz
    // mesela bir kare klasiyla iliskiyi inheritance ile saglariz

    public void cizme(){
        // instance metodda bu sekilde yazilabilir
    }
}
