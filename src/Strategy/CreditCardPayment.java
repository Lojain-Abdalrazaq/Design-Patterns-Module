package Strategy;

public class CreditCardPayment implements PaymentMehod{

    private CreditCard card;
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }

}
