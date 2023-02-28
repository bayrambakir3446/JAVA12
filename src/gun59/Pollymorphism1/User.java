package gun59.Pollymorphism1;

public class User {
    public String name;
    public String cauntry;

    public User(String name, String cauntry) {
        this.name = name;
        this.cauntry = cauntry;
    }

    public void showInfo(){
        System.out.println("User info : "+this.name);
        System.out.println("User info : "+this.name);


    }
}
