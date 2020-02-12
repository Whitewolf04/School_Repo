package Copter;

//--------------------------------------------------
// Part: Helicopter Class
// Written by: Tuan To || 40114920
//--------------------------------------------------

import Airplane.Airplane;

/**
 * Represents a helicopter
 * @author Tuan To
 * @student_id 40114920
 * @course COMP 249 Section S
 */
public class Helicopter extends Airplane{
	protected int cylinderNum, creationYear, passengerCap;
	
	/**
	 * Create an empty helicopter
	 * Initiallize all attributes to default value
	 */
	public Helicopter() {
		super();
		cylinderNum = 0;
		creationYear = 0;
		passengerCap = 0;
	}
	
	/**
	 * Create a helicopter with set attributes
	 * @param brand, price, horse power, number of cylinder, year of creation, and passenger capacity
	 */
	public Helicopter(String brand, double price, int hp, int cylinderNum, int creationYr, int passCap) {
		super(brand, price, hp);
		this.cylinderNum = cylinderNum;
		this.creationYear = creationYr;
		this.passengerCap = passCap;
	}
	
	/**
	 * Create a helicopter by copying another helicopter
	 * @param anotherCopter Another helicopter
	 */
	public Helicopter(Helicopter anotherCopter) {
		this.brand = anotherCopter.brand;
		this.price = anotherCopter.price;
		this.hp = anotherCopter.hp;
		this.cylinderNum = anotherCopter.cylinderNum;
		this.creationYear = anotherCopter.creationYear;
		this.passengerCap = anotherCopter.passengerCap;
	}
	
	/**
	 * Get the number of cylinder of the helicopter
	 * @return The number of cylinder as an int
	 */
	public int getCylinderNum() {
		return this.cylinderNum;
	}
	
	/**
	 * Get the year of creation of the helicopter
	 * @return The year of creation of the helicopter
	 */
	public int getCreationYear() {
		return this.creationYear;
	}
	
	/**
	 * Get the passenger capacity of the helicopter
	 * @return The passenger capacity of the helicopter as an int
	 */
	public int getPassengerCap() {
		return this.passengerCap;
	}
	
	/**
	 * Print out all attributes of the helicopter
	 * @return A string describing the helicopter
	 */
	public String toString() {
		return("This helicopter is manufactured by " + this.brand + " since " + creationYear 
				+ ". It has " + cylinderNum + " cylinders and can carry " + passengerCap + " passengers. It has " 
				+ hp + " horse power and costs " + price + "$.");
	}
	
	/**
	 * Comparing two helicopters
	 * @return The truth value of the comparison
	 */
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(otherObj.getClass() != this.getClass()) {
			return false;
		} else {
			Helicopter other = (Helicopter) otherObj;
			return(this.brand.equalsIgnoreCase(other.brand) && this.price == other.price && this.hp == other.hp
					&& this.cylinderNum == other.cylinderNum && this.creationYear == other.creationYear 
					&& this.passengerCap == other.passengerCap);
		}
	}
}
