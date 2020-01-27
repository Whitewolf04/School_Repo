package shape;

public class ShapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setRadius(2.0);
		System.out.println("Area of c1: " + c1.getArea());
		Circle c2 = new Circle();
		c2.setRadius(4.0);
		System.out.println("Area of c2: " + c2.getArea());
		
		Rectangle r1 = new Rectangle();
		r1.setHeight(2.0);;
		r1.setWidth(4.0);;
		System.out.println("Area of r1: " + r1.getArea());
		Rectangle r2 = new Rectangle();
		r2.setHeight(3.0);
		r2.setWidth(6.0);
		System.out.println("Area of r2: " + r2.getArea());
		
		Shape[] myArray = {c1, c2, r1, r2};
		double totalArea;
		totalArea = ShapeDriver.totalArea(myArray);
		System.out.println("Total area: " + totalArea);
		
	}
	public static double totalArea(Shape[] shapeArray) {
		double total = 0.0;
		for(int i = 0; i < shapeArray.length; i++) {
			total += shapeArray[i].getArea();
		}
		return total;
	}

}
