package strategy;

public class Main {

	public static void main(String[] args) {
		
		PaymentContext context1 = new PaymentContext(new PayPalPayment());
		context1.executePayment();
		
		PaymentContext context2 = new PaymentContext(new CreditCardPayment());
		context2.executePayment();

	}

}
