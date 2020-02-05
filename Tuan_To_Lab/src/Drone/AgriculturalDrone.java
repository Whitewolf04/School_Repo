package Drone;

import uav.UAV;

public class AgriculturalDrone extends UAV{
	private String brand;
	private int carryCap;
	public AgriculturalDrone() {
		super();
		brand = null;
		carryCap = 0;
	}
	
	public AgriculturalDrone(double weight, double price, String brand, int carryCap) {
		super(weight, price);
		this.brand = brand;
		this.carryCap = carryCap;
	}
	
	public AgriculturalDrone(AgriculturalDrone other) {
		this.weight = other.weight;
		this.price = other.price;
		this.brand = other.brand;
		this.carryCap = other.carryCap;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public int getCarryCap() {
		return this.carryCap;
	}
	
	// toString method
	public String toString() {
		return("This Agricultural Drone is manufactured by " + brand + ". It weights " + weight + " pounds, and costs " + price
				+ "$. It can carry up to " + carryCap + "kg.");
	}
	
	// equals method
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(otherObj.getClass() != this.getClass()) {
			return false;
		} else {
			AgriculturalDrone other = (AgriculturalDrone) otherObj;
			return(other.weight == this.weight && other.price == this.price && this.brand.equalsIgnoreCase(other.brand) 
					&& this.carryCap == other.carryCap);
		}
	}
}
