package patterns.adapter;


/**
 * Класс для обработки платежей в вашей системе
 */
public class MyPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(String orderId, double amount) {
        System.out.println("Processing payment for order " + orderId + " with amount $" + amount);
        // Реализация обработки платежа в вашей системе
    }
}