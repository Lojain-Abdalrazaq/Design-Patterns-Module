package FactoryMethod;

public class CheeseBurger implements Burger{
    @Override
    public void prepare(){
        System.out.println("Preparing Cheese Burger....");
    }
}
