package FactoryMethod;

public class Main { public static void main(String[] args) {


    Restaurant beefResto = new BeefRestaurant();
    beefResto.orderBurger();

    System.out.println("==========================================");

    Restaurant cheeseResto = new CheeseRestaurant();
    cheeseResto.orderBurger();
}
}
