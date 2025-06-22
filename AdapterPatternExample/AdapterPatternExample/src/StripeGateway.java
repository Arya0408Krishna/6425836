public class StripeGateway {
    public boolean charge(double amountInDollars) {
        System.out.println("Charging $" + amountInDollars + " via Stripe.");
        return true;
    }
}