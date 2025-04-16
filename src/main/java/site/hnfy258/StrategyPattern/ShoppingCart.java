package site.hnfy258.StrategyPattern;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
