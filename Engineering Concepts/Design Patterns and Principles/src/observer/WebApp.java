package observer;

public class WebApp implements Observer{
	
	@Override
	public void update() {
		System.out.println("Web App Notified");
	}
}
