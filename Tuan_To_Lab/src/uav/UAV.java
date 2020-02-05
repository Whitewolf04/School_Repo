package uav;

import Assignment2.FlyingObject;

public class UAV extends FlyingObject{
	protected double weight;
	
	public UAV() {
		price = 0.0;
		weight = 0.0;
	}
	
	public UAV(double weight, double price) {
		this.price = price;
		this.weight = weight;
	}
	
	public UAV(UAV another) {
		this.price = another.price;
		this.weight = another.weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	// toString method
	public String toString() {
		return("This UAV weights " + weight + " pounds and costs " + price + "$.");
	}
	
	// equals method
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