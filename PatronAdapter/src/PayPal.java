public class PayPal {
    public String processPayment(double amount, String currency){
        System.out.println("Pagando " + amount + " " + currency +" con Paypal");
        return "exito";
    }
}
