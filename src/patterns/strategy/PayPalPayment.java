package patterns.strategy;

/**
 * PayPal Payment implementation class
 */
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        // Реализация оплаты с использованием PayPal
        System.out.println("Оплата через PayPal на сумму: $" + amount);
    }
}