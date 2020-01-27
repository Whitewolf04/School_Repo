package animal;

public class Dog extends Animal{
	public Dog() {
		super(true, true);
	}
	
	public String getGreeting() {
		return "Ruff!";
	}
}
