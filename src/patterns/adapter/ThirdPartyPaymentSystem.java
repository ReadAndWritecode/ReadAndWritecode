package patterns.adapter;


/**
 * Интерфейс платежной системы
 */
public interface ThirdPartyPaymentSystem {
    void makePayment(String transactionId, double paymentAmount);
}
