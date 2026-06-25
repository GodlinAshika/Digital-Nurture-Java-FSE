package observer;

public interface Stock {
	
	//method to register
	void register(Observer observer);
	
	//method to deregister
	void deregister(Observer observer);
	
	//method to notify
	void notifyObservers();

}
