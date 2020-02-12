package uav;

//--------------------------------------------------
// Part: UAV Class
// Written by: Tuan To || 40114920
//--------------------------------------------------

import Flying_Object.FlyingObject;

/**
* Represents an UAV 
* @author Tuan To 
* @student_id 40114920
* @course COMP 249 Section S 
*/
public class UAV extends FlyingObject{
	protected double weight;
	
	/**
	* Creates an empty UAV 
	* Sets all attributes to default values
	*/
	public UAV() {
		super();
		weight = 0.0;
	}
	
	/**
	* Creates an UAV with set attributes
	* @param weight, price 
	*/
	public UAV(double weight, double price) {
		super(price);
		this.weight = weight;
	}
	
	/**
	* Creates an UAV by copying another UAV 
	* @param another Another UAV 
	*/
	public UAV(UAV another) {
		this.price = another.price;
		this.weight = another.weight;
	}
	
	/**
	* Gets the weight of the UAV 
	* @return The weight of the UAV 
	*/
	public double getWeight() {
		return this.weight;
	}
	
	/**
	* Gets the price of the UAV 
	* @return The price of the UAV as a double 
	*/
	public double getPrice() {
		return this.price;
	}
	
	/**
	* Prints out all attributes of the UAV 
	* @return A string describing the UAV 
	*/
	public String toString() {
		return("This UAV weights " + weight + " pounds and costs " + price + "$.");
	}
	
	/** 
	* Compares two UAV 
	* @param otherObj Another UAV 
	* @return The truth value of the comparison
	*/
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(otherObj.getClass() != this.getClass()) {
			return false;
		} else {
			UAV other = (UAV) otherObj;
			return(other.weight == this.weight && other.price == this.price);
		}
	}
}
