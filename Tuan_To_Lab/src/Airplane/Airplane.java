package Airplane;

import Assignment2.FlyingObject;

public class Airplane extends FlyingObject{
	protected String brand;
	protected int hp;
	
	public Airplane() {
		super();
		brand = null;
		hp = 0;
	}
	
	public Airplane(String brand, double price, int hp) {
		super(price);
		this.brand = brand;
		this.hp = hp;
	}
	
	public Airplane(Airplane anotherPlane) {
		this.brand = anotherPlane.brand;
		this.price = anotherPlane.price;
		this.hp = anotherPlane.hp;
	}
	
	// Clone method
	public Airplane clone() {
		return new Airplane(this);
	}
	
	// Accessor
	public String getBrand() {
		return this.brand;
	}
	
	
	public int getHP() {
		return hp;
	}
	
	// Mutator
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	// toString method
	public String toString() {
		return("This Airplane is manufactured by " + brand + ".It has " + hp + " horse power and costs " + price + "$.");
	}
	
	// equals method
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(otherObj.getClass() != this.getClass()) {
			return false;
		} else {
			Airplane other = (Airplane) otherObj;
			return(brand.equalsIgnoreCase(other.brand) && price == other.price && hp == other.hp);
		}
	}

}
