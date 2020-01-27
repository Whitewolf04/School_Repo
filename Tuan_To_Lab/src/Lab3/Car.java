package Lab3;

public class Car extends Vehicle{
	private String engine;
	public Car() {
		super(4);
	}
	
	public Car(String engine) {
		this();
		this.engine = engine;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public String getEngine() {
		return this.engine;
	}
	
	public String toString() {
		return("This vehicle has " + getWheels() + " wheels and has a " + getEngine() + " type engine.");
	}
}
