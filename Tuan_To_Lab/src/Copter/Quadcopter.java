package Copter;

public class Quadcopter extends Helicopter{
	private int maxFlyingSpeed;
	public Quadcopter() {
		super();
		maxFlyingSpeed = 0;
	}
	
	public Quadcopter(String brand, double price, int hp, int cylinderNum, int creationYr, int passCap, int maxSpeed) {
		super(brand, price, hp, cylinderNum, creationYr, passCap);
		maxFlyingSpeed = maxSpeed;
	}
	
	public Quadcopter(Quadcopter anotherQuadcopter) {
		this.brand = anotherQuadcopter.brand;
		this.price = anotherQuadcopter.price;
		this.hp = anotherQuadcopter.hp;
		this.cylinderNum = anotherQuadcopter.cylinderNum;
		this.creationYear = anotherQuadcopter.creationYear;
		this.passengerCap = anotherQuadcopter.passengerCap;
		this.maxFlyingSpeed = anotherQuadcopter.maxFlyingSpeed;
		
	}
	
	// Clone method
	public Quadcopter clone() {
		return new Quadcopter(this);
	}
	
	public int getMaxFlyingSpeed() {
		return this.maxFlyingSpeed;
	}
	
	// toString method
	public String toString() {
		return("This Quadcopter is manufactured by " + this.brand + " since " + this.creationYear 
				+ ". It has " + this.cylinderNum + " cylinders and can carry " + this.passengerCap + " passengers. It has "
				+ this.hp + " horse power, can fly at " + maxFlyingSpeed + " mph, and costs " + this.price + "$.");
	}
	
	// equals method
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
