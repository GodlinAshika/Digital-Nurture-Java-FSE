package singleton;

public class Logger {
	//private static instance
	private static Logger instance;
	
	//private constructor
	private Logger() {
		
	}
	
	//public static method
	public static Logger getInstance() {
		if(instance==null) {
			instance=new Logger();
		}
		return instance;
	}
	
}
