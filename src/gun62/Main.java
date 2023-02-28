package gun62;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        int x=100;
        int y=0;
        Car otomobil=null;

        try {
           // int z=x/y;
            System.out.println(otomobil.getModel());
        }catch (ArithmeticException e){
            System.out.println("Tamsayi sifirla bolunmeye calisiliyor !");
            e.printStackTrace();
        } finally {
            System.out.println("burasi finally coded blogu...");
        }
        System.out.println("Program tamami calisiyor durmuyor yani anlasildimi");



    }
}
