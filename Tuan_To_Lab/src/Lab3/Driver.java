package Lab3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("gasoline");
		Truck truck = new Truck(5000);
		Vehicle[] array = {car, truck};
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
