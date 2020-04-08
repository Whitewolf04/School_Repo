import java.util.Scanner;

public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your word: ");
		String word = kb.next();
		
		System.out.println(word.contains("'"));
	}

}
