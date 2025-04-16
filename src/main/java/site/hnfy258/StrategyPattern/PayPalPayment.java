package site.hnfy258.StrategyPattern;

public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paypal payment of $" + amount + " made to " + email);
    }
}
