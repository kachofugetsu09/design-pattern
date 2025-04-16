package site.hnfy258.StrategyPattern;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("123456789", "张三"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment("123456789@qq.com"));
        cart.checkout(100);

    }
}
