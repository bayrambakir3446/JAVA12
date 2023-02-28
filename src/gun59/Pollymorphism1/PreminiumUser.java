package gun59.Pollymorphism1;

public class PreminiumUser extends User{
    public int price;

    public PreminiumUser(String name, String cauntry) {
        super(name, cauntry);
    }
    public void  showInfo(){
        System.out.println("prreminium User "+this.price);
    }
}
