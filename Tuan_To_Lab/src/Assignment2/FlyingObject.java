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
	
	public static FlyingObject[] sort(FlyingObject[] array) {
		FlyingObject[] a = new FlyingObject[array.length];
		for(int j = 0; j < array.length; j++) {
			a[j] = array[j];
		}
		
		FlyingObject temp = null;
		for(int i = 0; i < a.length - 1; i++) {
			for(int k = i+1; k < a.length; k++) {
				if(a[k].getPrice() > a[i].getPrice()){
					temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
		}
		
		
		return(a);
	}
}
