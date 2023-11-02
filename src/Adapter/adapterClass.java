package Adapter;

public class adapterClass implements restaurantInterface{

    // creeating a service object
    private final Service service;
    public adapterClass(){
        service  = new Service();
    }
    @Override
    public void displayMenus(XmlData xmlData){
        // converting to Json
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Menus using converted JSON data...");
        service.displayMenus(jsonData);
    }
    private JsonData convertXmlToJson(XmlData xmlData) {
        // Converts XmlData to JsonData and return it
        System.out.println("Converting XML to JSON...");
        return new JsonData();
    }
}
