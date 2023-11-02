package FactoryMethod;

public class CheeseRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Creating Cheese Burger...");
        return new CheeseBurger();
    }
}
