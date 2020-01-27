package animal;

abstract public class Animal {
	protected boolean isMammal;
	protected boolean isCarnivorous;
	
	Animal() {
	}
	
	Animal(boolean isMammal, boolean isCarnivorous){
		this.isCarnivorous = isCarnivorous;
		this.isMammal = isMammal;
	}
	
	
	public boolean getIsMammal() {
		return isMammal;
	}
	public boolean getIsCarnivorous() {
		return isCarnivorous;
	}
	abstract String getGreeting();
}
