package Multirotor;

//--------------------------------------------------
// Part: Multirotor Class
// Written by: Tuan To || 40114920
//--------------------------------------------------

import Copter.Helicopter;

/**
* Represents a Multirotor
* @author Tuan To 
* @student_id 40114920
* @course COMP 249 Section S 
*/
public class Multirotor extends Helicopter{
	private int rotorNum;

	/**
	* Creates an empty Multirotor 
	* Sets all attributes to default values
	*/
	public Multirotor() {
		super();
		rotorNum = 0;
	}
	
	/**
	* Creates a Multirotor with set attributes 
	* @param brand, price, horse power, number of cylinder, year of creation, passenger capacity, number of rotors 
	*/
	public Multirotor(String brand, double price, int hp, int cylinderNum, int creationYr, int passCap, int rotorNum) {
		super(brand, price, hp, cylinderNum, creationYr, passCap);
		this.rotorNum = rotorNum;
	}
	
	/**
	* Creates a Multirotor by copying another Multirotor
	* @param another Another Multirotor
	*/
	public Multirotor(Multirotor another) {
		this.brand = another.brand;
		this.price = another.price;
		this.hp = another.hp;
		this.cylinderNum = another.cylinderNum;
		this.creationYear = another.creationYear;
		this.passengerCap = another.passengerCap;
		this.rotorNum = another.rotorNum;
	}
	
	/**
	* Gets the number of rotors of the Multirotor
	* @return The number of rotors 
	*/
	public int getRotorNum() {
		return this.rotorNum;
	}
	
	/**
	* Prints out all attributes of the Multirotor 
	* @return A string describing the Multirotor
	*/
	public String toString() {
		return("This Multirotor is manufactured by " + this.brand + " since " + this.creationYear 
				+ ". It has " + this.cylinderNum + " cylinders and can carry " + this.passengerCap + " passengers. It has "
				+ this.hp + " horse power, " + rotorNum + " rotors, and costs " + this.price + "$.");
	}
	
	/**
	* Compares two Multirotor 
	* @param otherObj Another Multirotor
	* @return The truth value of the comparison
	*/
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(otherObj.getClass() != this.getClass()) {
			return false;
		} else {
			Multirotor other = (Multirotor) otherObj;
			return(this.brand.equalsIgnoreCase(other.brand) && this.price == other.price && this.hp == other.hp
					&& this.cylinderNum == other.cylinderNum && this.creationYear == other.creationYear 
					&& this.passengerCap == other.passengerCap && this.rotorNum == other.rotorNum);
		}
	}
}
