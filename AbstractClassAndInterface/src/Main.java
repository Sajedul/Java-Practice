public class Main {
    public static void main(String[] args) {

        PaymentProcessor creditCardProcessor = new CreditCardProcessor("Merchant123");

        PaymentGateway paypalGateway = new PayPalGateway();
        PaymentService paymentService = new PaymentService(creditCardProcessor, paypalGateway);
        paymentService.processPayment(150.00);

        PaymentGateway stripeGateway = new StripeGateway();
        paymentService = new PaymentService(creditCardProcessor, stripeGateway);
        paymentService.processPayment(250.00);
    }
}