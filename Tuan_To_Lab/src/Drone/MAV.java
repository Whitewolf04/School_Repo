package Drone;

import uav.UAV;

public class MAV extends UAV{
	private String model;
	private double size;
	
	public MAV() {
		super();
		model = null;
		size = 0.0;
	}
	
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}
	
	public MAV(MAV other) {
		this.weight = other.weight;
		this.price = other.price;
		this.model = other.model;
		this.size = other.size;
	}
	
	// Clone method
	public MAV clone() {
		return new MAV(this);
	}
	
	public String getModel() {
		return this.model;
	}
	
	public double getSize() {
		return this.size;
	}
	
	// toString method
	public String toString() {
		return("This MAV is model " + model + ", weights " + weight + " pounds and costs " + price 
				+ "$. It has a size of " + size + " inches.");
	}
	
	// equals method
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
