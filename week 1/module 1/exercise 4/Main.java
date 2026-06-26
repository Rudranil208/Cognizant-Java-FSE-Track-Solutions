package AdapterPatternExample;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PaypalAdapter(new PaypalGateway());

        PaymentProcessor stripe =
                new GpayAdapter(new GpayGateway());

        paypal.processPayment(5000);

        stripe.processPayment(7500);
    }
}
