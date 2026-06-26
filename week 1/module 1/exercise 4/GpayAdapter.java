package AdapterPatternExample;

public class GpayAdapter implements PaymentProcessor{
    private GpayGateway gpay;

    public GpayAdapter(GpayGateway gpay) {
        this.gpay = gpay;
    }
    
    @Override
    public void processPayment(double amount)
    {
        gpay.makeCharge(amount);
    }
}

