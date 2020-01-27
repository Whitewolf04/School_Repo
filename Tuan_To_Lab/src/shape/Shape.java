package shape;

abstract public class Shape {
	private double height = 0;
	private double width = 0;
	private char pattern = '*';
	//Constructor
	
	public Shape() {
	}
	
	public Shape(int h, int w) {
		this.height = h;
		this.width = w;
	}
	
	public Shape(int h) {
		this.height = h;
	}
	
	//Setters
	public void setHeight(double h) {
		this.height = h;
	}
	
	public void setWidth(double w) {
		this.width = w;
	}
	
	public void setPattern(char c) {
		this.pattern = c;
	}
	
	//Getters
	public double getHeight() {return this.height;}
	public double getWidth() {return this.width;}
	public char getPattern() {return this.pattern;}
	public String toString() {
		return getClass() + " => Height: " + getHeight() + " Width: " + getWidth();
	}
	
	abstract public double getArea();
}
