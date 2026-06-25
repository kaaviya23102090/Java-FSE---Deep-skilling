interface PaymentProcessor
{
    void processPayment(double amount);
}
 class payPal 
 {
    public void makePayment(double amount)
    {
        System.out.println("Paid Rs."+amount+"using paypal");

    }
 }
 class Gateway 
 {
    public void makeAmount(double amount)
    {
        System.out.println("Paid Rs."+amount+"using gateway");

    }
 }
 class PayPalAdapter implements PaymentProcessor
 {
    private  payPal p;
    public PayPalAdapter(payPal p)
    {
        this.p=p;
    }
    public void processPayment( double amount)
    {
p.makePayment(amount);
    }


 }
  class GatewayAdapter implements PaymentProcessor
 {
    private  Gateway g;
    public GatewayAdapter(Gateway g)
    {
        this.g=g;
    }
    public void processPayment( double amount)
    {
g.makeAmount(amount);
    }


 }