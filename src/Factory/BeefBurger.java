package Factory;

public class BeefBurger implements Burger{
    @Override
    public void Prepare() {
        System.out.println("Preparing Beef Burger....");
        System.out.println("Done");
    }
}
