package Assignment3;

import java.io.*;
import java.util.Scanner;

public class BibliographyFactory {
	public static void main(String[] args) {
		String filepath = null;
		
		for(int i = 1; i < 11; i++) {
			filepath = "Latex" + i + ".bib";
			processFilesForValidation(i, filepath);
		}
		
		int count = 1;
		BufferedReader br = null;
		int lines = 0;
		Scanner kb = new Scanner(System.in);
		while(count <= 2) {
			try {
				System.out.print("\nPlease enter the name of the file you want to open: ");
				String filename = kb.next();
				br = new BufferedReader(new FileReader(filename));
				while(br.readLine() != null) {
					lines++;
				}
				// Reset the buffered reader to top of the file
				br = new BufferedReader(new FileReader(filename));
				System.out.println("Here is the content of the successfully created JSON file: " + filename);
				for(int i = 0; i < lines; i++) {
					System.out.println(br.readLine());
				}
				System.out.print("Goodbye! Hope you have enjoyed creating needed files using BibliographyFactory.");
				System.exit(0);
			} catch(FileNotFoundException e) {
				count += 1;
				System.out.println("Error: File not found!!");
			} catch(IOException e) {
				System.out.println("Error: Input/Output Exception");
			}
		}
		System.out.println("Could not open input file again! Either file does not exist or could not be created.");
		System.out.print("Sorry! I am unable to display your desired files! The program will exit.");
		
		kb.close();
		
	}
	
	public static void processFilesForValidation(int num, String filename){
		File ogFile = new File(filename);
		File ieeeFile = new File("IEEE" + num + ".json");
		File acmFile = new File("ACM" + num + ".json");
		File njFile = new File("NJ" + num + ".json");
		File tempIEEE = new File("IEEEtemp.json");
		File tempACM = new File("ACMtemp.json");
		File tempNJ = new File("NJtemp.json");
		
		Scanner sc = null;
		PrintWriter ieee = null;
		PrintWriter acm = null;
		PrintWriter nj = null;
		try {
			sc = new Scanner(new FileInputStream(ogFile));
			ieee = new PrintWriter(new FileOutputStream(tempIEEE));
			acm = new PrintWriter(new FileOutputStream(tempACM));
			nj = new PrintWriter(new FileOutputStream(tempNJ));
		} catch(FileNotFoundException e) {
			System.out.println("Could not open input file Latex" + num + ".bib for reading.");
			System.out.println();
			System.out.println("Please check if the file exists! Program will terminate after closing any opened files.");
		}
		
		String myFile = "";
		
		// Reading from the Scanner
		while(sc.hasNextLine()) {
			myFile += sc.nextLine();
			myFile += "\n";
		}
		
		//  Processing the File after reading
		String[] articles = myFile.split("@ARTICLE");
		String[] linesInArticle;
		
		for(int i = 1; i <= articles.length-1; i++) {
			linesInArticle = articles[i].split("\n");
			String journal = null, title = null, year = null, volume = null;
			String number = null, pages = null, doi = null, month = null;
			String[] authors = null;
			for(int k = 0; k < linesInArticle.length; k++) {
				linesInArticle[k] = linesInArticle[k].trim();
				if(linesInArticle[k].startsWith("author")) {
					linesInArticle[k] = linesInArticle[k].replace("author={", "");
					linesInArticle[k] = linesInArticle[k].replace("},", "");
					
					// Throws the exception if category is empty
					try {
						if(linesInArticle[k].equals("")) {
							throw new FileInvalidException();
						}
					} catch(FileInvalidException e) {
						ieeeFile.delete();
						acmFile.delete();
						njFile.delete();
						ieee.close();
						acm.close();
						nj.close();
						System.out.println("Error: Detected Empty Field!");
						System.out.println("============================");
						System.out.println();
						System.out.println("Problem detected with file: " + filename);
						System.out.println("File is invalid: Field \"author\" is Empty. Processing stopped at this point. Other empty fields my present as well!");
						return;
					}
					
					authors = linesInArticle[k].split(" and");
				}
				if(linesInArticle[k].startsWith("journal")) {
					linesInArticle[k] = linesInArticle[k].replace("journal={", "");
					linesInArticle[k] = linesInArticle[k].replace("},", "");
					journal = linesInArticle[k];
					
					//Throws exception if this category is empty
					try {
						if(journal.equals("")) {
							throw new FileInvalidException();
						}
					} catch(FileInvalidException e) {
						ieeeFile.delete();
						acmFile.delete();
						njFile.delete();
						ieee.close();
						acm.close();
						nj.close();
						System.out.println("Error: Detected Empty Field!");
						System.out.println("============================");
						System.out.println();
						System.out.println("Problem detected with file: " + filename);
						System.out.println("File is invalid: Field \"journal\" is Empty. Processing stopped at this point. Other empty fields my present as well!");
						return;
					}
				}
				if(linesInArticle[k].startsWith("title")) {
					linesInArticle[k] = linesInArticle[k].replace("title={", "");
					linesInArticle[k] = linesInArticle[k].replace("},", "");
					title = linesInArticle[k];
					
					//Throws exception if this category is empty
					try {
						if(title.equals("")) {
							throw new FileInvalidException();
						}
					} catch(FileInvalidException e) {
						ieeeFile.delete();
						acmFile.delete();
						njFile.delete();
						ieee.close();
						acm.close();
						nj.close();
						System.out.println("Error: Detected Empty Field!");
						System.out.println("============================");
						System.out.println();
						System.out.println("Problem detected with file: " + filename);
						System.out.println("File is invalid: Field \"title\" is Empty. Processing stopped at this point. Other empty fields my present as well!");
						return;
					}
				}
				if(linesInArticle[k].startsWith("year")) {
					linesInArticle[k] = linesInArticle[k].replace("year={", "");
					linesInArticle[k] = linesInArticle[k].replace("},", "");
					year = linesInArticle[k];
					
					//Throws exception if this category is empty
					try {
						if(year.equals("")) {
							throw new FileInvalidException();
						}
					} catch(FileInvalidException e) {
						ieeeFile.delete();
						acmFile.delete();
						njFile.delete();
						ieee.close();
						acm.close();
						nj.close();
						System.out.println("Error: Detected Empty Field!");
						System.out.println("============================");
						System.out.println();
						System.out.println("Problem detected with file: " + filename);
						System.out.println("File is invalid: Field \"year\" is Empty. Processing stopped at this point. Other empty fields my present as well!");
						return;
					}
				}
				if(linesInArticle[k].startsWith("volume")) {
					linesInArticle[k] = linesInArticle[k].replace("volume={", "");
					linesInArticle[k] = linesInArticle[k].replace("},", "");
					volume = linesInArticle[k];
					
					//Throws exception if this category is empty
					try {
						if(volume.equals("")) {
							throw new FileInvalidException();
						}
					} catch(FileInvalidException e) {
						ieeeFile.delete();
						acmFile.delete();
						njFile.delete();
						ieee.close();
						acm.close();
						nj.close();
						System.out.println("Error: Detected Empty Field!");
						System.out.println("============================");
						System.out.println();
						System.out.println("Problem detected with file: " + filename);
						System.out.println("File is invalid: Field \"volume\" is Empty. Processing stopped at this point. Other empty fields my present as well!");
						return;
					}
				}
				if(linesInArticle[k].startsWith("number")) {
					linesInArticle[k] = linesInArticle[k].replace("number={", "");
					linesInArticle[k] = linesInArticle[k].replace("},", "");
					number = linesInArticle[k];
					
					//Throws exception if this category is empty
					try {
						if(number.equals("")) {
							throw new FileInvalidException();
						}
					} catch(FileInvalidException e) {
						ieeeFile.delete();
						acmFile.delete();
						njFile.delete();
						ieee.close();
						acm.close();
						nj.close();
						System.out.println("Error: Detected Empty Field!");
						System.out.println("============================");
						System.out.println();
						System.out.println("Problem detected with file: " + filename);
						System.out.println("File is invalid: Field \"number\" is Empty. Processing stopped at this point. Other empty fields my present as well!");
						return;
					}
				}
				if(linesInArticle[k].startsWith("pages")) {
					linesInArticle[k] = linesInArticle[k].replace("pages={", "");
					linesInArticle[k] = linesInArticle[k].replace("},", "");
					pages = linesInArticle[k];
					
					//Throws exception if this category is empty
					try {
						if(pages.equals("")) {
							throw new FileInvalidException();
						}
					} catch(FileInvalidException e) {
						ieeeFile.delete();
						acmFile.delete();
						njFile.delete();
						ieee.close();
						acm.close();
						nj.close();
						System.out.println("Error: Detected Empty Field!");
						System.out.println("============================");
						System.out.println();
						System.out.println("Problem detected with file: " + filename);
						System.out.println("File is invalid: Field \"pages\" is Empty. Processing stopped at this point. Other empty fields my present as well!");
						return;
					}
				}
				if(linesInArticle[k].startsWith("doi")) {
					linesInArticle[k] = linesInArticle[k].replace("doi={", "");
					linesInArticle[k] = linesInArticle[k].replace("},", "");
					doi = linesInArticle[k];
					
					//Throws exception if this category is empty
					try {
						if(doi.equals("")) {
							throw new FileInvalidException();
						}
					} catch(FileInvalidException e) {
						ieeeFile.delete();
						acmFile.delete();
						njFile.delete();
						ieee.close();
						acm.close();
						nj.close();
						System.out.println("Error: Detected Empty Field!");
						System.out.println("============================");
						System.out.println();
						System.out.println("Problem detected with file: " + filename);
						System.out.println("File is invalid: Field \"doi\" is Empty. Processing stopped at this point. Other empty fields my present as well!");
						return;
					}
				}
				if(linesInArticle[k].startsWith("month")) {
					linesInArticle[k] = linesInArticle[k].replace("month={", "");
					linesInArticle[k] = linesInArticle[k].replace("},", "");
					month = linesInArticle[k];
					
					//Throws exception if this category is empty
					try {
						if(month.equals("")) {
							throw new FileInvalidException();
						}
					} catch(FileInvalidException e) {
						ieeeFile.delete();
						acmFile.delete();
						njFile.delete();
						ieee.close();
						acm.close();
						nj.close();
						System.out.println("Error: Detected Empty Field!");
						System.out.println("============================");
						System.out.println();
						System.out.println("Problem detected with file: " + filename);
						System.out.println("File is invalid: Field \"month\" is Empty. Processing stopped at this point. Other empty fields my present as well!");
						return;
					}
				}
			}
			
			//System.out.println("Process for file Latex" + num + ".bib reaches here");
			// Printing for IEEE format
			for(int a = 0; a < authors.length; a++) {
				ieee.print((a == authors.length-1)? authors[a]: (authors[a] + ","));
			}
			ieee.print(". \"" + title + "\", " + journal + ", vol. " + volume + ", no. " + number + ", p. " + pages
					+ ", " + month + " " + year + ".");
			ieee.println("\n");
			
			// Printing for ACM format
			acm.print("[" + i + "]\t");
			acm.print((authors.length == 1)? authors[0]: (authors[0] + " et al. "));
			acm.print(year + ". " + title + ". " + journal + ". " + volume + ", " + number + " (" + year + "), "
					+ pages + ". DOI:https://doi.org/" + doi + ".");
			acm.println("\n");
			
			//Printing for NJ format
			for(int a = 0; a < authors.length; a++) {
				nj.print((a == authors.length-1)? authors[a]: (authors[a] + " &"));
			}
			nj.print(". " + title + ". " + journal + ". " + volume + ", " + pages + "(" + year + ").");
			nj.println("\n");
		}
		ieee.close();
		acm.close();
		nj.close();
		
		Scanner scIEEE = null;
		Scanner scACM = null;
		Scanner scNJ = null;
		try {
			scIEEE = new Scanner(new FileInputStream("IEEEtemp.json"));
			scACM = new Scanner(new FileInputStream("ACMtemp.json"));
			scNJ = new Scanner(new FileInputStream("NJtemp.json"));
			ieee = new PrintWriter(new FileOutputStream(ieeeFile));
			acm = new PrintWriter(new FileOutputStream(acmFile));
			nj = new PrintWriter(new FileOutputStream(njFile));
		}catch(FileNotFoundException e) {
			System.out.println();
		}
		
		while(scIEEE.hasNextLine()) {
			ieee.println(scIEEE.nextLine());
		}
		while(scACM.hasNextLine()) {
			acm.println(scACM.nextLine());
		}
		while(scNJ.hasNextLine()) {
			nj.println(scNJ.nextLine());
		}
		scIEEE.close();
		scACM.close();
		scNJ.close();
		ieee.close();
		acm.close();
		nj.close();
		System.out.println(tempIEEE.delete());
		System.out.println(tempACM.delete());
		System.out.println(tempNJ.delete());
		
	}
	
}
