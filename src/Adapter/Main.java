package Adapter;

public class Main {

    public static void main(String[] args) {

        XmlData myData = new XmlData();
        // Old UI
        restaurantInterface resto = new restaurant();
        resto.displayMenus(myData);
        System.out.println("==========================================");
        // New UI
        restaurantInterface adapter = new adapterClass();
        adapter.displayMenus(myData);
    }
}