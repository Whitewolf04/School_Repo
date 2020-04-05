package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;

public class SubDictionary {
	public static void main(String[] args) {
		ArrayList<String> entries = new ArrayList<String>();
		Scanner sc = null;
		PrintWriter pw = null;
		String writeTo = "SubDictionary.txt";
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter the file you want to read from: ");
		String readFr = kb.next();
		
		try {
			sc = new Scanner(new FileInputStream(readFr));
			pw = new PrintWriter(new FileOutputStream(writeTo));
		} catch(FileNotFoundException e) {
			System.out.println("Find cannot be found to read!!");
			System.out.println("System will exit!");
			sc.close();
			pw.close();
			System.exit(0);
		}
		
		String contentOfFile = "";
		String[] passages;
		String[] punctuations = {"'", ",", ".", "?", "!", ":", "="};
		String[] words = null;
		
		while(sc.hasNextLine()) {
			contentOfFile += sc.next();
		}
		
		passages = contentOfFile.split("\n");
		for(int i = 0; i < passages.length; i++) {
			// Going through every words to check for punctuations and number in the word
			words = passages[i].split(" ");
			for(int k = 0; k < words.length; k++) {
				boolean containsDigit = false;
				for(String punc : punctuations) {
					if (words[k].contains(punc)) {
						words[k] = words[k].replace(punc, "");
					}
				}
				char[] charArray = words[k].toCharArray();
				for(char letter : charArray) {
					if(Character.isDigit(letter)) {
						containsDigit = true;
					}
				}
				
				// If conditions are satisfied, write the word to the array list
				if(containsDigit == true) {
					continue;
				} else {
					entries.add(words[k]);
				}
			}
		}
		
		
		
	}
}
