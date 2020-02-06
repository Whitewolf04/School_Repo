package Assignment2;

public abstract class FlyingObject {
	protected double price;
	
	public FlyingObject() {
		price = 0;
	}
	
	public FlyingObject(FlyingObject another) {
		this.price = another.price;
	}
	
	public abstract FlyingObject clone();
	
	public double getPrice() {
		return price;
	}
	
	public abstract String toString();
	public abstract boolean equals(Object otherObj);
}
