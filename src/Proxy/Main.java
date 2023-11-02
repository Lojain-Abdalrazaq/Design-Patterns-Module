package Proxy;

public class Main {
    public static void main (String[] args) {
        Internet internet = new Proxy();
        try {
            internet.connectTo("ex.com");
            internet.connectTo("abc.com");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
