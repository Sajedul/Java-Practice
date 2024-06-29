public class PaymentService {
    private PaymentProcessor paymentProcessor;
    private PaymentGateway paymentGateway;

    public PaymentService(PaymentProcessor paymentProcessor, PaymentGateway paymentGateway) {
        this.paymentProcessor = paymentProcessor;
        this.paymentGateway = paymentGateway;
    }
    public void processPayment(double amount) {
        paymentGateway.connect();
        boolean success = paymentGateway.processPayment(amount);
        if (success) {
            paymentProcessor.processPayment(amount);
        } else {
            System.out.println("Payment processing failed.");
        }
        paymentGateway.disconnect();
    }
}
