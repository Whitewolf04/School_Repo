package animal;

public class animalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cow cow = new Cow();
		Duck duck = new Duck();
		
		System.out.println(dog.getGreeting());
		System.out.println(cow.getGreeting());
		System.out.println(duck.getGreeting());
	}

}
