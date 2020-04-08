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
		String[] punctuations = {",", ".", "?", "!", ":", "="};
		String[] words = null;
		
		while(sc.hasNext()) {
			contentOfFile += sc.next();
			contentOfFile += " ";
		}
		//Testing--------------------------------------
		System.out.println(contentOfFile);
		//----------------------------------------------
		sc.close();
		
		passages = contentOfFile.split("\n");
		for(int i = 0; i < passages.length; i++) {
			// Going through every words to check for punctuations and number in the word
			words = passages[i].split(" ");
			for(int k = 0; k < words.length; k++) {
				boolean containsDigit = false;
				boolean containsSingleQuote = false;
				for(String punc : punctuations) {
					if (words[k].contains(punc)) {
						words[k] = words[k].replace(punc, "");
					}
				}
				if(words[k].contains("'")) {
					containsSingleQuote = true;
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
				} else if(containsSingleQuote == true) {
					continue;
				} else {
					entries.add(words[k]);
				}
			}
		}
		
		entries = sort(entries);
		String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		
		// Writing the entries into the file
		for(String letter : alphabet) {
			pw.println(letter);
			pw.println("==");
			for(String entry : entries) {
				if(entry.startsWith(letter)) {
					pw.println(entry);
				}
			}
			pw.println();
		}
		
		pw.close();
	}
	
	public static ArrayList<String> sort(ArrayList<String> list){
		ArrayList<String> result = (ArrayList<String>) list.clone();
		String temp;
		// Deleting the repeated words and upper case every words
		for(int i = 0; i < result.size(); i++) {
			temp = result.get(i);
			result.remove(i);
			result.add(i, temp.toUpperCase());
			for(int k = i+1; k < result.size(); k++) {
				if(result.get(i).compareToIgnoreCase(result.get(k)) == 0) {
					result.remove(k);
				}
			}
		}
		
		// Sort the words in order
		for(int i = 0; i < result.size(); i++) {
			for(int k = i+1; k < result.size(); k++) {
				if(result.get(i).compareToIgnoreCase(result.get(k)) > 0) {
					temp = result.get(k);
					result.remove(k);
					result.add(k, result.get(i));
					result.remove(i);
					result.add(i, temp);
				}
			}
		}
		return result;
	}
}
