package gun50;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.name="Arac";
        vehicle.start();
        Car car=new Car();
        car.brand="BMW";
        car.name="X1";
        car.honk();
        car.start();
       // car.propellerSize;
    }
}
