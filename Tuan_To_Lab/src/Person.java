
public class Person {
	private String name;
	private int age;
	private char gender;
	
	private void format() {
		String newName = "";
		char firstChar = Character.toUpperCase(this.name.charAt(0)); 
		char[] myArray = this.name.toCharArray();
		newName += firstChar;
		for(int i = 1; i < this.name.length(); i++) {
			newName += myArray[i];
		}
		this.name = newName;
	}
	
	public Person() {
		this.name = null;
		this.age = 0;
		this.gender = '\0';
	}
	
	public Person(Person sbd) {
		this.name = sbd.name;
		format();
		this.age = sbd.age;
		this.gender = sbd.gender;
	}
	
	public Person(String name, int age, char gender) {
		this.name = name;
		format();
		this.age = age;
		if(gender != 'M' && gender != 'F') {
			System.out.println("The gender you entered is not valid");
			this.gender = '\0';
		} else {
			this.gender = gender;
		}
	}
	
	
	//Accessor Methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	
	//Mutator Methods
	public void setName(String name) {
		this.name = name;
		format();
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		if(gender != 'M' && gender != 'F') {
			System.out.println("The gender you entered is not valid");
			this.gender = '\0';
		} else {
			this.gender = gender;
		}
	}
	
	//Equals method to compare between two people
	public boolean equals(Person anotherPerson) {
		boolean value = this.name.compareToIgnoreCase(anotherPerson.name) == 0 && this.age == anotherPerson.age && this.gender == anotherPerson.gender;
		return value;
	}
	
	//toString method to print out the attributes of a person
	public String toString() {
		String genderInString;
		if(gender == 'M') {
			genderInString = "male";
		} else if(gender == 'F') {
			genderInString = "female";
		}else {
			genderInString = "";
		}
		return("This person's name is " + name + ", with the age of " + age + " years old, and is a " + genderInString + ".");
	}
}
