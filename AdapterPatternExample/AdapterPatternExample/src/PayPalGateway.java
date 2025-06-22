public class PayPalGateway {
    public boolean makePayment(String amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
        return true;
    }
}