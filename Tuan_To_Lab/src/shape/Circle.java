package shape;

public class Circle extends Shape {
	public Circle() {
		super();
	}
	
	public Circle(int h, int w) {
		super(h);
		super.setWidth(h);
	}
	
	//Setters
	public void setRadius(double r) {
		super.setHeight(r);
		super.setWidth(r);
	}
	
	//Getters
	public double getRadius() {
		return getHeight();
	}
	
	//Area
	public double getArea() {
		double area = 0.0;
		area = getHeight() * getHeight() * Math.PI;
		return area;
	}
	
	// toString method
	public String toString() {
		return("This circle has radius of " + getHeight() + " and area of " + getArea());
	}
}
