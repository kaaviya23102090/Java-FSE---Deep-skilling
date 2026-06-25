public class adapterTest {

    public static void main(String[] args) {


        PaymentProcessor paypalProcessor =
                new PayPalAdapter(new payPal());

        paypalProcessor.processPayment(5000);

        PaymentProcessor stripeProcessor =
                new GatewayAdapter(new Gateway());

        stripeProcessor.processPayment(3000);
    }
}