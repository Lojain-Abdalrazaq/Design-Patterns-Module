package Observer;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(new EmailMsgListener("geekific@subs.com"));
        store.newItemPromotion();
    }

}
