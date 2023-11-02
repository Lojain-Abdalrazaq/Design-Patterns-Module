package FactoryMethod;

public abstract class Restaurant {
    // so the main difference is we change the Factory class into Factory Method that
    public void orderBurger() {
        System.out.println("Ordering Burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    // this is the abstact factory that will be implemented in the sub-classes (Cheese and Beef)
    public abstract Burger createBurger();
}
