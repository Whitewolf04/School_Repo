package Flying_Object;

// --------------------------------------------------
// Part: Super class of all classes created
// Written by: Tuan To || 40114920
// --------------------------------------------------

/**
 * Represents anything that has the ability to fly
 * @author Tuan To
 * @student_id 40114920
 * @course COMP 249 Section S
 */
public class FlyingObject {
	protected double price;
	
	
	/**
	 * Create an empty FlyingObject
	 * Set price attribute to default
	 */
	public FlyingObject() {
		price = 0;
	}
	
	/**
	 * Create a Flying Object with set price
	 * @param price
	 */
	public FlyingObject(double price) {
		this.price = price;
	}
	
	/**
	 * Create a Flying Object copying another Flying Object
	 * @param another another Flying Object
	 */
	public FlyingObject(FlyingObject another) {
		this.price = another.price;
	}
	
	/**
	 * Get the price of the Flying Object
	 * @return price of the Flying Object as double
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Set the price of the Flying Object
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Prints out the attributes of the Flying Object
	 * @return A string describing the Flying Object
	 */
	public String toString() {
		return("This flying object costs " + price);
	}
	
	/**
	 * Compares two Flying Objects
	 * @return A truth value of the comparison
	 */
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
	
	/**
	 * Sort the price of an array of Flying Objects
	 * @param array An array of Flying Objects
	 * @return A new array of Flying Objects with price sorted from highest to lowest
	 */
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
