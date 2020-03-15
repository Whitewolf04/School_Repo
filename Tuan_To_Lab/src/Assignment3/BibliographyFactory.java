package Assignment3;

import java.io.*;
import java.util.Scanner;

public class BibliographyFactory {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter pwIEEE = null;
		PrintWriter pwACM = null;
		PrintWriter pwNJ = null;
		
		for(int i = 1; i < 11; i++) {
			try {
				sc = new Scanner(new FileInputStream("Latex" + i + ".bib"));
				File ieee = new File("D:\\Java\\COMP249_W20_Assg3_Files\\IEEE\\IEEE" + i + ".json");
				File acm = new File("D:\\Java\\COMP249_W20_Assg3_Files\\ACM\\ACM" + i + ".json");
				File nj = new File("D:\\Java\\COMP249_W20_Assg3_Files\\NJ\\NJ" + i + ".json");
				pwIEEE = new PrintWriter(new FileOutputStream(ieee));
				pwACM = new PrintWriter(new FileOutputStream(acm));
				pwNJ = new PrintWriter(new FileOutputStream(nj));
				processFilesForValidation(sc, pwIEEE, pwACM, pwNJ);
				System.out.println("Process file " + i + " successfully!!");
			} catch(FileNotFoundException e) {
				System.out.println("Could not open input file Latex" + i + ".bib for reading.");
				System.out.println();
				System.out.println("Please check if the file exists! Program will terminate after closing any opened files.");
			} catch(FileInvalidException e) {
				System.out.println(e.getMessage());
			} 
		}
	}
	
	public static void processFilesForValidation(Scanner sc, PrintWriter ieee, PrintWriter acm, PrintWriter nj) throws FileInvalidException{
		String myFile = "";
		String[] articles = myFile.split("@ARTICLE");
		String[] linesInArticle;
		
		for(int i = 0; i < articles.length; i++) {
			linesInArticle = articles[i].split("\n");
			String journal = null, title = null, year = null, volume = null;
			String number = null, pages = null, doi = null, month = null;
			String[] authors = null;
			for(int k = 0; k < linesInArticle.length; k++) {
				if(linesInArticle[k].startsWith("author")) {
					linesInArticle[k] = linesInArticle[k].replace("author={", "");
					linesInArticle[k] = linesInArticle[k].replace("}", "");
					
					// Throws the exception if category is empty
					if(linesInArticle[k] == "") {
						throw new FileInvalidException();
					}
					
					authors = linesInArticle[k].split("and");
				}
				if(linesInArticle[k].startsWith("journal")) {
					linesInArticle[k] = linesInArticle[k].replace("journal={", "");
					linesInArticle[k] = linesInArticle[k].replace("}", "");
					journal = linesInArticle[k];
					
					//Throws exception if this category is empty
					if(journal == "") {
						throw new FileInvalidException();
					}
				}
				if(linesInArticle[k].startsWith("title")) {
					linesInArticle[k] = linesInArticle[k].replace("title={", "");
					linesInArticle[k] = linesInArticle[k].replace("}", "");
					title = linesInArticle[k];
					
					//Throws exception if this category is empty
					if(title == "") {
						throw new FileInvalidException();
					}
				}
				if(linesInArticle[k].startsWith("year")) {
					linesInArticle[k] = linesInArticle[k].replace("year={", "");
					linesInArticle[k] = linesInArticle[k].replace("}", "");
					year = linesInArticle[k];
					
					//Throws exception if this category is empty
					if(year == "") {
						throw new FileInvalidException();
					}
				}
				if(linesInArticle[k].startsWith("volume")) {
					linesInArticle[k] = linesInArticle[k].replace("volume={", "");
					linesInArticle[k] = linesInArticle[k].replace("}", "");
					volume = linesInArticle[k];
					
					//Throws exception if this category is empty
					if(volume == "") {
						throw new FileInvalidException();
					}
				}
				if(linesInArticle[k].startsWith("number")) {
					linesInArticle[k] = linesInArticle[k].replace("number={", "");
					linesInArticle[k] = linesInArticle[k].replace("}", "");
					number = linesInArticle[k];
					
					//Throws exception if this category is empty
					if(number == "") {
						throw new FileInvalidException();
					}
				}
				if(linesInArticle[k].startsWith("pages")) {
					linesInArticle[k] = linesInArticle[k].replace("pages={", "");
					linesInArticle[k] = linesInArticle[k].replace("}", "");
					pages = linesInArticle[k];
					
					//Throws exception if this category is empty
					if(pages == "") {
						throw new FileInvalidException();
					}
				}
				if(linesInArticle[k].startsWith("doi")) {
					linesInArticle[k] = linesInArticle[k].replace("doi={", "");
					linesInArticle[k] = linesInArticle[k].replace("}", "");
					doi = linesInArticle[k];
					
					//Throws exception if this category is empty
					if(doi == "") {
						throw new FileInvalidException();
					}
				}
				if(linesInArticle[k].startsWith("month")) {
					linesInArticle[k] = linesInArticle[k].replace("month={", "");
					linesInArticle[k] = linesInArticle[k].replace("}", "");
					month = linesInArticle[k];
					
					//Throws exception if this category is empty
					if(month == "") {
						throw new FileInvalidException();
					}
				}
			}
			
			// Printing for IEEE format
			for(int a = 0; a < authors.length; a++) {
				ieee.print((a == authors.length-1)? authors[a]: (authors[a] + ","));
			}
			ieee.print(". \"" + title + "\", " + journal + ", vol. " + volume + ", no. " + number + ", p. " + pages
					+ ", " + month + " " + year + ".");
			
			// Printing for ACM format
			acm.print("[" + i + "]\t");
			acm.print((authors.length == 1)? authors[0]: (authors[0] + " et al. "));
			acm.print(year + ". " + title + ". " + journal + ". " + volume + ", " + number + " (" + year + "), "
					+ pages + ". DOI:https://doi.org/" + doi + ".");
			
			//Printing for NJ format
			for(int a = 0; a < authors.length; a++) {
				nj.print((a == authors.length-1)? authors[a]: (authors[a] + " &"));
			}
			nj.print(". " + title + ". " + journal + ". " + volume + ", " + pages + "(" + year + ").");
		}
	}
	
}
