public class PaymentProcessorTest {
    public static void main(String[] args) {
        // Test PayPal payment processing
        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
        System.out.println("PayPal Payment Success: " + payPalProcessor.processPayment(100.50));

        // Test Stripe payment processing
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        System.out.println("Stripe Payment Success: " + stripeProcessor.processPayment(200.75));
    }
}