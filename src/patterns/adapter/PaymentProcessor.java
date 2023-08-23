package patterns.adapter;


/**
 * Интерфейс для обработки платежей в вашей системе
 */
public interface PaymentProcessor {
    void processPayment(String orderId, double amount);
}