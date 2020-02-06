package Multirotor;

import Copter.Helicopter;

public class Multirotor extends Helicopter{
	private int rotorNum;
	public Multirotor() {
		super();
		rotorNum = 0;
	}
	
	public Multirotor(String brand, double price, int hp, int cylinderNum, int creationYr, int passCap, int rotorNum) {
		super(brand, price, hp, cylinderNum, creationYr, passCap);
		this.rotorNum = rotorNum;
	}
	
	public Multirotor(Multirotor another) {
		this.brand = another.brand;
		this.price = another.price;
		this.hp = another.hp;
		this.cylinderNum = another.cylinderNum;
		this.creationYear = another.creationYear;
		this.passengerCap = another.passengerCap;
		this.rotorNum = another.rotorNum;
	}
	
	// Clone method
	public Multirotor clone() {
		return new Multirotor(this);
	}
	
	public int getRotorNum() {
		return this.rotorNum;
	}
	
	// toString method
	public String toString() {
		return("This Multirotor is manufactured by " + this.brand + " since " + this.creationYear 
				+ ". It has " + this.cylinderNum + " cylinders and can carry " + this.passengerCap + " passengers. It has "
				+ this.hp + " horse power, " + rotorNum + " rotors, and costs " + this.price + "$.");
	}
	
	// equals method
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
