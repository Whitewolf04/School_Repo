package Drone;

//--------------------------------------------------
// Part: MAV Class
// Written by: Tuan To || 40114920
//--------------------------------------------------

import uav.UAV;

/**
* Represents a MAV
* @author Tuan To 
* @student_id 40114920
* course COMP 249 Section S 
*/
public class MAV extends UAV{
	private String model;
	private double size;
	
	/**
	* Creates an empty MAV 
	* Sets all attributes to default values
	*/
	public MAV() {
		super();
		model = null;
		size = 0.0;
	}
	
	/**
	* Creates a MAV with set attributes 
	* @param weight, price, model, size 
	*/
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}
	
	/**
	* Creates a MAV by copying another MAV 
	* @param other Another MAV 
	*/
	public MAV(MAV other) {
		this.weight = other.weight;
		this.price = other.price;
		this.model = other.model;
		this.size = other.size;
	}
	
	/**
	* Gets the model of the MAV 
	* @return The model of the MAV as a String
	*/
	public String getModel() {
		return this.model;
	}
	
	/**
	* Gets the size of the MAV
	* @return The size of the MAV as a double 
	*/
	public double getSize() {
		return this.size;
	}
	
	/**
	* Prints out all attributes of the MAV
	* @return A string describing the MAV 
	*/
	public String toString() {
		return("This MAV is model " + model + ", weights " + weight + " pounds and costs " + price 
				+ "$. It has a size of " + size + " inches.");
	}
	
	/**
	* Compares two MAV 
	* @param otherObj Another MAV
	* @return The truth value of the comparison
	*/
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(otherObj.getClass() != this.getClass()) {
			return false;
		} else {
			MAV other = (MAV) otherObj;
			return(other.weight == this.weight && other.price == this.price && this.model.equalsIgnoreCase(other.model)
					&& this.size == other.size);
		}
	}
}
