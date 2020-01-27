package shape;

public class Triangle extends Shape{
	private int angle = 90;
	public Triangle(int h, int w) {
		super(h, w);
	}
	
	public int getAngle() {
		return this.angle;
	}
	
	public String toString() {
		return getClass() + " => Height: " + getHeight() + " Width: " + getWidth() + " Angle: " + getAngle();
	}
	
	public void draw() {
		for(int k = 0; k < getHeight(); k++) {
			for(int i = 0; i < getWidth(); i++) {
				System.out.println(getPattern());
			}
		}
	}
	
	public double getArea() {
		double area = 0.0;
		area = getHeight()*getWidth()*0.5;
		return area;
	}
}
