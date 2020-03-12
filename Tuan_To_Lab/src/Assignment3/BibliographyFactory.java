package Assignment3;

import java.io.*;
import java.util.Scanner;

public class BibliographyFactory {
	public static void main(String[] args) {
		int countArticle = 0;
		Scanner sc = null;
		
		for(int i = 1; i < 11; i++) {
			try {
				sc = new Scanner(new FileInputStream("Latex" + i + ".bib"));
			} catch(FileNotFoundException e) {
				System.out.println("Could not open input file Latex" + i + ".bib for reading.");
				System.out.println();
				System.out.println("Please check if the file exists! Program will terminate after closing any opened files.");
			}
		}
	}
	
	public static void processFilesForValidation(Scanner sc) {
		int countArticle = 0;
		
		//Counting how many articles there are in the file
		while(sc.hasNextLine()) {
			if(sc.nextLine() == "@ARTICLE{") {
				countArticle += 1;
			}
		}
		
		
	}
}
