package animal;

public class Cow extends Animal{
	public Cow() {
		super(true, false);
	}
	
	public String getGreeting() {
		return "Moo!";
	}

}
