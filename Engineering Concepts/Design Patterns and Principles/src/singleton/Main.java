package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		
		System.out.println(logger1==logger2);
	}

}
