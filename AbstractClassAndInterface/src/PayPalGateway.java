public class PayPalGateway implements PaymentGateway {
    @Override
    public void connect() {
        System.out.println("Connecting to PayPal...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PayPal...");
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal...");
        return true; // Simulating successful payment
    }
}
