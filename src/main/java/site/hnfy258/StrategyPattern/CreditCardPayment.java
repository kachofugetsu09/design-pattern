package site.hnfy258.StrategyPattern;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String name;

    public CreditCardPayment(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}
