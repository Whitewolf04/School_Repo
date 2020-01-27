
public class Cylinder {
	private double radius, height;
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	
	public Cylinder(Cylinder c) {
		this.radius = c.radius;
		this.height = c.height;
	}
	
	//Accessor Method
	public double getRadius() {
		return this.radius;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getArea() {
		double area = 2*radius*radius*Math.PI + 2*radius*height*Math.PI;
		return area;
	}
	
	// Mutator Method
	public void setRadius(double r) {
		this.radius = r;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	// Equals Method
	public boolean equals(Object otherObject) {
		if(otherObject == null) {
			return false;
		} else if(getClass() != otherObject.getClass()) {
			return false;
		} else {
			Cylinder otherCylinder = (Cylinder) otherObject;
			return(this.height == otherCylinder.height && this.radius == otherCylinder.radius);
		}
	}
	
	// toString Method
	public String toString() {
		return("Radius: " + this.radius + ", Height: " + this.height + ", Area: " + getArea());
	}
	
	public static double getTotalArea(Cylinder[] c) {
		double area = 0.0;
		for(int i = 0; i < c.length; i++) {
			area += c[i].getArea();
		}
		return area;
	}
	
}
