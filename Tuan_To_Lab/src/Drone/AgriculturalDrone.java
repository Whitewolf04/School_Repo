package Drone;

//--------------------------------------------------
// Part: AAgricultural Drone Class
// Written by: Tuan To || 40114920
//--------------------------------------------------

import uav.UAV;

/**
* Represents an Agricultural Drone
* @author Tuan To 
* @student_id 40114920
* @course COMP 249 Section S 
*/
public class AgriculturalDrone extends UAV{
	private String brand;
	private int carryCap;

	/**
	* Create an empty Agricultural Drone 
	* Sets all attributes to default value 
	*/
	public AgriculturalDrone() {
		super();
		brand = null;
		carryCap = 0;
	}
	
	/**
	* Create an Agricultural Drone with set attributes 
	* @param weight, price, brand, carry capacity
	*/
	public AgriculturalDrone(double weight, double price, String brand, int carryCap) {
		super(weight, price);
		this.brand = brand;
		this.carryCap = carryCap;
	}
	
	/**
	* Create an Agricultural Drone by copying another Agricultural Drone
	* @param other Another Agricultural Drone 
	*/
	public AgriculturalDrone(AgriculturalDrone other) {
		this.weight = other.weight;
		this.price = other.price;
		this.brand = other.brand;
		this.carryCap = other.carryCap;
	}
	
	/**
	* Gets the brand of the Agricultural Drone
	* @return The brand of the Agricultural Drone as a string 
	*/
	public String getBrand() {
		return this.brand;
	}
	
	/**
	* Gets the carrying capacity of the Agricultural Drone
	* @return The carry capacity of the Agricultural Drone
	*/
	public int getCarryCap() {
		return this.carryCap;
	}

	/**
	* Prints out all attributes of the Agricultural Drone
	* @return A string describing the Agricultural Drone
	*/
	public String toString() {
		return("This Agricultural Drone is manufactured by " + brand + ". It weights " + weight + " pounds, and costs " + price
				+ "$. It can carry up to " + carryCap + "kg.");
	}
	
	/**
	* Compares two Agricultural Drone 
	* @param otherObj Another Agricultural Drone
	* @return The truth value of the comparison
	*/
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
