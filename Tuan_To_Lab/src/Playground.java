import java.util.Scanner;
import java.util.StringTokenizer;
public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input: ");
		String line = sc.nextLine();
		System.out.println(line.startsWith("author"));
		line = line.replace("author={", "");
		line = line.replace("}",  "");
		String[] myLine = line.split("and");
		for(String i : myLine) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
