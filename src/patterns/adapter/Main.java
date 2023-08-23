package patterns.adapter;

// Использование
public class Main {

    public static void main(String[] args) {

        PaymentProcessor myPaymentProcessor = new MyPaymentProcessor();

        myPaymentProcessor.processPayment("12345", 100.00);



        ThirdPartyPaymentSystem paypalPaymentSystem = new PayPalPaymentSystem();

        PaymentProcessor adapter = new PaymentSystemAdapter(paypalPaymentSystem);

        adapter.processPayment("54321", 50.00);
    }
}