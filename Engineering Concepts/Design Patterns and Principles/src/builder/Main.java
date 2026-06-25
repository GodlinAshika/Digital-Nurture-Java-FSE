package builder;

public class Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer.Builder()
								.cpu("i7")
								.ram(16)
								.storage(512)
								.build();
		
		System.out.println(computer.toString());

	}

}
