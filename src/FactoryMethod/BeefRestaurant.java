package FactoryMethod;

public class BeefRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Creating Beef Burger...");
        return new BeefBurger();
    }
}
