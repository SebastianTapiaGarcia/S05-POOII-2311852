import java.util.HashMap;
import java.util.Map;

public class MercadoPago {
    public Map<String, Object> executePayment(double amount) {
        System.out.println("Pagando S/." + amount + " con MercadoPago");
        Map<String, Object> mapa = new HashMap<>();
        mapa.put("status","exito");
        return mapa;
    }
}
