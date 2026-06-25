package command;

public class Main {

	public static void main(String[] args) {
		Light light = new Light();
		Command onCommand = new LightOnCommand(light);
		Command offCommand = new LightOffCommand(light);
		
		RemoteControl remote1 = new RemoteControl(onCommand);
		remote1.pressButton();
		
		RemoteControl remote2 = new RemoteControl(offCommand);
		remote2.pressButton();
	}

}
