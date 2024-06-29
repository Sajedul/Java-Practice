public class StripeGateway implements PaymentGateway {
    @Override
    public void connect() {
        System.out.println("Connecting to Stripe...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Stripe...");
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe...");
        return true; // Simulating successful payment
    }
}
