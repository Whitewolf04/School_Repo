package Airplane;

//--------------------------------------------------
// Part: Airplane Class
// Written by: Tuan To || 40114920
//--------------------------------------------------

import Flying_Object.FlyingObject;

/**
 * Represents an airplane
 * @author Tuan To
 * @student_id 40114920
 * @course COMP 249 Section S
 */
public class Airplane extends FlyingObject{
	protected String brand;
	protected int hp;
	
	/**
	 * Create an empty Airplane
	 * Set all attributes to default
	 */
	public Airplane() {
		super();
		brand = null;
		hp = 0;
	}
	
	/**
	 * Create an Airplane with set attributes
	 * @param brand, price, horse power
	 */
	public Airplane(String brand, double price, int hp) {
		super(price);
		this.brand = brand;
		this.hp = hp;
	}
	
	/**
	 * Create an Airplane by copying another Airplane
	 * @param anotherPlane
	 */
	public Airplane(Airplane anotherPlane) {
		this.brand = anotherPlane.brand;
		this.price = anotherPlane.price;
		this.hp = anotherPlane.hp;
	}
	
	/**
	 * Get the brand of the Airplane
	 * @return The brand of the airplane as a string
	 */
	public String getBrand() {
		return this.brand;
	}
	
	/**
	 * Get the horse power of the airplane
	 * @return The horse power of the airplane as an int
	 */
	public int getHP() {
		return hp;
	}
	
	/**
	 * Set the brand of the airplane
	 * @param brand New brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * Set the horse power of the airplane
	 * @param hp New horse power
	 */
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	/**
	 * Print out all attributes of the airplane
	 * @return The description of the airplane
	 */
	public String toString() {
		return("This Airplane is manufactured by " + brand + ".It has " + hp + " horse power and costs " + price + "$.");
	}
	
	/**
	 * Compare between two Airplanes
	 * @return The truth value of the comparison
	 */
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
