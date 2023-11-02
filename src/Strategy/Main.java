package Strategy;

public class Main {
    public static void main(String[] args) {

        PaymentMehod creditCard = new CreditCardPayment();
        PaymentMehod paypal = new PayPalPayement();
        creditCard.pay(100);
        paypal.pay(1000);
    }
}
