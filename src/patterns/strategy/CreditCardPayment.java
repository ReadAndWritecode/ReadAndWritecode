package patterns.strategy;

/**
 * Credit card Payment implementation class
 */
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public void pay(double amount) {
        // Реализация оплаты с использованием кредитной карты
        System.out.println("Оплата с использованием кредитной карты на сумму: $" + amount);
    }
}