public class StripeAdapter implements PaymentProcessor{
    Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }
    
    @Override
    public boolean processPayment(double amount, String currency){
        return stripe.charge(amount);
    }
}
