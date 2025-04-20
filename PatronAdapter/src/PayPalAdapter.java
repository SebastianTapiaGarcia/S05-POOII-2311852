public class PayPalAdapter implements PaymentProcessor{
    PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }
    
    @Override
    public boolean processPayment(double amount, String currency){
        String resultado = paypal.processPayment(amount, currency);
        return "exito".equals(resultado);
    }
}
