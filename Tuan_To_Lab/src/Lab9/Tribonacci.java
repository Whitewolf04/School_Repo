package Lab9;

import java.io.FileOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Tribonacci {
	private PrintWriter pw = null;
	private File myFile = new File("Tribonacci.txt");
	private int count;
	private int[] tribonacci = {0, 0, 1};
	
	public Tribonacci() {
		count = 2;
	}
	
	public void tribonacciAtPosition(int pos) {
		int temp;
		if(count > pos) {
			writeToFile(pos, tribonacci[pos]);
		} else if(count == pos){
			writeToFile(pos, tribonacci[2]);
		} else {
			count++;
			temp = tribonacci[0] + tribonacci[1] + tribonacci[2];
			tribonacci[0] = tribonacci[1];
			tribonacci[1] = tribonacci[2];
			tribonacci[2] = temp;
			tribonacciAtPosition(pos);
		}
		
	}
	
	public void writeToFile(int position, int number) {
		try {
			pw = new PrintWriter(new FileOutputStream(myFile, true));
		} catch(FileNotFoundException e) {
			System.out.println("Cannot write to the file!!");
		}
		pw.println("The " + position + "th position of the Tribonacci array is the number: " + number);
		pw.close();
	}
}
