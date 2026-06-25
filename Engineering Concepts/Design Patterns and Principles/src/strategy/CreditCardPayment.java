package strategy;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public void pay() {
		System.out.println("Payment done using Credit Card");
	}
}
