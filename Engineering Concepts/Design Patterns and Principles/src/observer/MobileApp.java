package observer;

public class MobileApp implements Observer{
	
	@Override
	public void update() {
		System.out.println("Mobile App Notified");
	}
}
