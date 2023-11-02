package Templet;

abstract class OrderProcessTemplate {
    public boolean isGift;

    public abstract void doSelect();

    public abstract void doPayment();

    public final void giftWrap(){
        try
        {
            System.out.println("Gift wrap successful");
        }
        catch (Exception e)
        {
            System.out.println("Gift wrap unsuccessful");
        }
    }
    public abstract void doDelivery();

    public final void processOrder(boolean isGift)
    {
        doSelect(); // abstract method
        doPayment(); // abstract method
        if (isGift) {
            giftWrap();
        }
        doDelivery(); // abstract method
    }
}
