public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public boolean processPayment(double amount) {
        // Directly pass the amount to Stripe
        return stripeGateway.charge(amount);
    }
}