package patterns.adapter;


/**
 * Адаптер для интеграции платежной системы с вашей системой
 */
public class PaymentSystemAdapter implements PaymentProcessor {
    private ThirdPartyPaymentSystem paymentSystem;

    public PaymentSystemAdapter(ThirdPartyPaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    @Override
    public void processPayment(String orderId, double amount) {
        // Генерируем уникальный идентификатор транзакции
        String transactionId = generateTransactionId();
        paymentSystem.makePayment(transactionId, amount);
    }

    private String generateTransactionId() {
        // Генерация уникального идентификатора транзакции
        return "TXN" + System.currentTimeMillis();
    }
}