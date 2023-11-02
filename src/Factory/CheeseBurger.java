package Factory;

public class CheeseBurger implements Burger{
    @Override
    public void Prepare() {
        System.out.println("Preparing Cheese Burger....");
    }
}
