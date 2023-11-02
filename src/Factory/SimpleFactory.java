package Factory;

public class SimpleFactory {

    /**
     * As shown, it solved the single responsibity, but still open for modfication
     * Has if-else statements
     * **/
    public Burger createBurger(String request){
        Burger burger = null;
        if ("BEEF".equals(request)){
            burger = new BeefBurger();
        }else if("CHEESE".equals(request)){
            burger = new CheeseBurger();
        }
        return burger;
    }


}
