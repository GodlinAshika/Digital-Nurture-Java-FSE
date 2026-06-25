package observer;

public class Main {

	public static void main(String[] args) {
		StockMarket market = new StockMarket();

		Observer mobile = new MobileApp();
		Observer web = new WebApp();

		market.register(mobile);
		market.register(web);
		
		market.deregister(mobile);
		market.deregister(web);
		
		market.register(mobile);


		market.notifyObservers();

	}

}
