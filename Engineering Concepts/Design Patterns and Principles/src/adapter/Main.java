package adapter;

public class Main {

	public static void main(String[] args) {
		
		//payment using PayPal
		PayPalGateway gateway1 = new PayPalGateway();

		PaymentProcessor processor1 =
		        new PayPalAdapter(gateway1);

		processor1.processPayment();
		
		//payment using Stripe
		StripeGateway gateway2 = new StripeGateway();

		PaymentProcessor processor2 =
		        new StripeAdapter(gateway2);

		processor2.processPayment();
	}

}
