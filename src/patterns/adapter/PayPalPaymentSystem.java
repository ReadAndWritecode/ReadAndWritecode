package patterns.adapter;


/**
 * Сторонняя платежная система
 */
public class PayPalPaymentSystem implements ThirdPartyPaymentSystem {
    @Override
    public void makePayment(String transactionId, double paymentAmount) {
        System.out.println("Making PayPal payment with transaction ID " + transactionId + " for amount $" + paymentAmount);
        // Реализация платежа через PayPal
    }
}