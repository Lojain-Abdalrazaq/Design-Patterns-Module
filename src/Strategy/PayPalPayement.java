package Strategy;

public class PayPalPayement implements PaymentMehod {
    @Override
    public void pay(int amount){
        // payement using the PayPal method
        System.out.println("Paying " + amount + " using Paypal Method");
    }
}
