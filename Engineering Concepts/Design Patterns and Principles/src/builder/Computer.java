package builder;

public class Computer {
	
	//attributes
	private String cpu;
	private int ram;
	private int storage;
	
	//add helper class Builder
	private Computer(Builder builder) {
		this.cpu = builder.cpu;
		this.ram = builder.ram;
		this.storage = builder.storage;
	}
	
	public static class Builder {
		private String cpu;
		private int ram;
		private int storage;
		
		public Builder cpu(String cpu) {
			this.cpu=cpu;
			return this;
		}
		
		public Builder ram(int ram) {
			this.ram=ram;
			return this;
		}
		
		public Builder storage(int storage) {
			this.storage=storage;
			return this;
		}
		
		public Computer build() {
		    return new Computer(this);
		}
	}
	
	@Override
	public String toString() {
	    return "Computer [cpu=" + cpu +
	           ", ram=" + ram +
	           ", storage=" + storage + "]";
	}
}
