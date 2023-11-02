package Singletone;

public class Singletone {
    /* volatile keyword ensures that multiple threads will be able to handle the singleton instance correctely */
    private static volatile Singletone obj = null;
    private String dbName;
    private Singletone(String dbData){
        this.dbName = dbData;
    }
    public static Singletone getInstance(String dbData){
        if (obj==null){
            synchronized (Singletone.class){
                if (obj == null){
                    obj = new Singletone(dbData);
                }
            }
        }
        return obj;
    }
}