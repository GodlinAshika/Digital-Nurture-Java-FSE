package strategy;

public class PayPalPayment implements PaymentStrategy{

	@Override
	public void pay() {
		System.out.println("Payment done using PayPal");
	}
}
