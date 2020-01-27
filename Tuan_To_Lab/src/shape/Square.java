package shape;

public class Square extends Shape{
	public Square(int h, int w) {
		super(h, w);
		if(h != w) {
			System.out.println("Error, a square has equal height and width!");
			setWidth(h);
		}
	}
	
	public void setHeight(int h) {
		super.setHeight(h);
		super.setWidth(h);
	}
	
	public void setWidth(int w) {
		super.setWidth(w);
		super.setHeight(w);
	}
	
	public void draw() {
		for(int k = 0; k < getHeight(); k++) {
			for(int i = 0; i < getWidth(); i++) {
				System.out.print(getPattern() + " ");
			}
			System.out.println();
		}
	}
	
	public double getArea() {
		double area;
		area = getHeight()* getHeight();
		return area;
	}
}
