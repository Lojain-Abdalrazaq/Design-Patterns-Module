package Factory;

public class Resturant {
    public Burger OrderBurger(String request){
        SimpleFactory factory = new SimpleFactory();
        Burger burger = factory.createBurger(request);
        burger.Prepare();
        return burger;
    }
}
