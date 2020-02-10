package Assignment2;


public class FlyingObject {
	protected double price;
	
	public FlyingObject() {
		price = 0;
	}
	
	
	public FlyingObject(double price) {
		this.price = price;
	}
	
	public FlyingObject(FlyingObject another) {
		this.price = another.price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return("This flying object costs " + price);
	}
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(otherObj.getClass() != this.getClass()) {
			return false;
		} else {
			FlyingObject other = (FlyingObject) otherObj;
			return(price == other.price);
		}
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
