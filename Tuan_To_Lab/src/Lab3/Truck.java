package Lab3;

public class Truck extends Vehicle{
	private int capacity;
	public Truck() {
		super(16);
	}
	
	public Truck(int capacity) {
		this();
		this.capacity = capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public String toString() {
		return("This vehicle has " + getWheels() + " wheels and has a capacity of " + getCapacity() + ".");
	}
}
