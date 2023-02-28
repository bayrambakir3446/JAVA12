package codingbatARRAY;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog=new Dog("Max",5,"Kangal");
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.bread);
        dog.move();
        dog.eat();
        dog.bark();
    }
}
