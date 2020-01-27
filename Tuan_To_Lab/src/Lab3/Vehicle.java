package Lab3;

public class Vehicle {
	private int wheels;
	
	public Vehicle() {
		wheels = 0;
	}
	
	public Vehicle(int wheels) {
		this.wheels = wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public int getWheels() {
		return this.wheels;
	}
	
	public String toString() {
		return("This vehicle has " + getWheels() + " wheels.");
	}
}
