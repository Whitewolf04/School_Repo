package Copter;

import Airplane.Airplane;

public class Helicopter extends Airplane{
	protected int cylinderNum, creationYear, passengerCap;
	public Helicopter() {
		super();
		cylinderNum = 0;
		creationYear = 0;
		passengerCap = 0;
	}
	
	public Helicopter(String brand, double price, int hp, int cylinderNum, int creationYr, int passCap) {
		super(brand, price, hp);
		this.cylinderNum = cylinderNum;
		this.creationYear = creationYr;
		this.passengerCap = passCap;
	}
	
	public Helicopter(Helicopter anotherCopter) {
		this.brand = anotherCopter.brand;
		this.price = anotherCopter.price;
		this.hp = anotherCopter.hp;
		this.cylinderNum = anotherCopter.cylinderNum;
		this.creationYear = anotherCopter.creationYear;
		this.passengerCap = anotherCopter.passengerCap;
	}
	
	// Accessor methods
	public int getCylinderNum() {
		return this.cylinderNum;
	}
	
	public int getCreationYear() {
		return this.creationYear;
	}
	
	public int getPassengerCap() {
		return this.passengerCap;
	}
	
	// toString method
	public String toString() {
		return("This helicopter is manufactured by " + this.brand + " since " + creationYear 
				+ ". It has " + cylinderNum + " cylinders and can carry " + passengerCap + " passengers. It has " 
				+ hp + " horse power and costs " + price + "$.");
	}
	
	// equals method
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
