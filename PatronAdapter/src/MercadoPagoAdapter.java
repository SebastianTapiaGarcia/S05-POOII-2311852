import java.util.Map;

public class MercadoPagoAdapter implements PaymentProcessor {
    MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public boolean processPayment(double amount, String currency) {
        Map<String, Object> resultado = mercadoPago.executePayment(amount);
        return "exito".equals(resultado.get("status"));
    }
}
