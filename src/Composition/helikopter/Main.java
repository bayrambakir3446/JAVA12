package Composition.helikopter;

public class Main {
    public static void main(String[] args) {
        Motor motor=new Motor(700,1000);
        Pervane pervane=new Pervane(10,2000);
        Depo depo=new Depo(2000);
        Helikopter olusturski= new Helikopter(0001,motor,pervane,depo);
        olusturski.getMotor().motorCalis();
        olusturski.getMotor().motoruKapat();

    }
}
