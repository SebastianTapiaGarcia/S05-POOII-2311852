public class Stripe {
    public boolean charge(double amount){
        System.out.println("Pagando $" + amount + " con Stripe");
        return true;
    }
}
