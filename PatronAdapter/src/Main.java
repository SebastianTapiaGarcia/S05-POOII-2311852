public class Main {

    public static void main(String[] args) {
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        PaymentProcessor mercadoPagoProcessor = new MercadoPagoAdapter(new MercadoPago());

        stripeProcessor.processPayment(115, "USD");
        paypalProcessor.processPayment(200, "EUR");
        mercadoPagoProcessor.processPayment(500, "PEN");
    }
}
