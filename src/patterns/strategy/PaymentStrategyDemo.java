package patterns.strategy;

/**
 * Demo class for pattern strategy
 */
public class PaymentStrategyDemo {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "12/25");
        context.setPaymentStrategy(creditCardPayment);
        context.processPayment(100.0);

        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        context.setPaymentStrategy(payPalPayment);
        context.processPayment(50.0);
    }
}

