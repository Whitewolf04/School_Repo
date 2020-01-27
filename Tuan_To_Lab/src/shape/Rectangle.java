package shape;

public class Rectangle extends Shape{
	public Rectangle() {
		super();
	}
	
	public Rectangle(int h, int w) {
		super(h, w);
	}
	
	public void draw() {
		for(int k = 0; k < getHeight(); k++) {
			for(int i = 0; i < getWidth(); i++) {
				System.out.print(getPattern() + " ");
			}
			System.out.print("\n");
		}
	}
	
	public double getArea() {
		double area = 0.0;
		area = getHeight() * getWidth();
		return area;
	}
}
