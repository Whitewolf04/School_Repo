package Assignment2;

public abstract class FlyingObject {
	protected double price;
	
	public FlyingObject() {
		price = 0;
	}
	
	public double getPrice() {
		return price;
	}
	
	public abstract String toString();
	public abstract boolean equals(Object otherObj);
}
