package Adapter;
public class restaurant implements restaurantInterface{
    @Override
    public void displayMenus(XmlData xmlData){
        System.out.println("Displaying Menus using XML data...");
    }
}
