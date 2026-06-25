package proxy;

public class Main {

	public static void main(String[] args) {

		Image image = new ProxyImage("cat.jpg");
		
		image.display();
		image.display();

	}

}
