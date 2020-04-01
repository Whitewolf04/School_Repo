package Lab10;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fillable[] myArray = new Fillable[5];
		
		myArray[0] = new Circle(1.0, 2.0, 3);
		myArray[1] = new Circle(4.0, 5.0, 2);
		myArray[2] = new Rectangle(1, 1, 5, 5);
		myArray[3] = new Rectangle(2, 3, 5, 6);
		myArray[4] = new Rectangle(-1, -2, 3, 4);
		
		myArray[0].fill(4);
		myArray[1].fill(1);
		myArray[2].draw(2);
		myArray[3].fill(5);
		myArray[4].fill(3);
	}

}
