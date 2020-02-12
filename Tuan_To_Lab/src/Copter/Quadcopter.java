package Copter;

//--------------------------------------------------
// Part: Quadcopter Class
// Written by: Tuan To || 40114920
//--------------------------------------------------

/**
 * Represents a Quadcopter
 * @author Tuan To
 * @student_id 40114920
 * @course COMP 249 Section S 
*/
public class Quadcopter extends Helicopter{
	private int maxFlyingSpeed;

	/**
	 * Create an empty Quadcopter
	 * Set all attributes to default values
	*/
	public Quadcopter() {
		super();
		maxFlyingSpeed = 0;
	}
	
	/**
	 * Create a Quadcopter with set attributes
	 * @param brand, price, horse power, number of cylinder, year of creation, passenger capacity, maximum speed
	*/
	public Quadcopter(String brand, double price, int hp, int cylinderNum, int creationYr, int passCap, int maxSpeed) {
		super(brand, price, hp, cylinderNum, creationYr, passCap);
		maxFlyingSpeed = maxSpeed;
	}
	
	/**
	* Create a Quadcopter by copying another Quadcopter
	* @param anotherQuadcopter
	*/
	public Quadcopter(Quadcopter anotherQuadcopter) {
		this.brand = anotherQuadcopter.brand;
		this.price = anotherQuadcopter.price;
		this.hp = anotherQuadcopter.hp;
		this.cylinderNum = anotherQuadcopter.cylinderNum;
		this.creationYear = anotherQuadcopter.creationYear;
		this.passengerCap = anotherQuadcopter.passengerCap;
		this.maxFlyingSpeed = anotherQuadcopter.maxFlyingSpeed;
		
	}
	
	/**
	* Get the maximum flying speed of the Quadcopter
	*/
	public int getMaxFlyingSpeed() {
		return this.maxFlyingSpeed;
	}
	
	/**
	* Print out all attributes of the Quadcopter
	* @return A string describing the Quadcopter
	*/
	public String toString() {
		return("This Quadcopter is manufactured by " + this.brand + " since " + this.creationYear 
				+ ". It has " + this.cylinderNum + " cylinders and can carry " + this.passengerCap + " passengers. It has "
				+ this.hp + " horse power, can fly at " + maxFlyingSpeed + " mph, and costs " + this.price + "$.");
	}
	
	/**
	* Compare two Quadcopters 
	* @param otherObj another Quadcopter
	* @return The truth value of the comparison
	*/
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(otherObj.getClass() != this.getClass()) {
			return false;
		} else {
			Quadcopter other = (Quadcopter) otherObj;
			return(this.brand.equalsIgnoreCase(other.brand) && this.price == other.price && this.hp == other.hp
					&& this.cylinderNum == other.cylinderNum && this.creationYear == other.creationYear 
					&& this.passengerCap == other.passengerCap && this.maxFlyingSpeed == other.maxFlyingSpeed);
		}
	}
}
