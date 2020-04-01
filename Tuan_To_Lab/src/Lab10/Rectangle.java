package Lab10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Rectangle implements Fillable{
	private double x1, y1, x2, y2;
	private File myFile = new File("Draw.txt");
	private PrintWriter pw = null;
	private String colour;
	
	public Rectangle(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void draw(int color) {
		if(color < 1 || color > 5) {
			System.out.println("Invalid Color!!!");
		} else {
			try {
				pw = new PrintWriter(new FileOutputStream(myFile, true));
			}catch(FileNotFoundException e) {
				System.out.println("File cannot be found!!");
			}
			
			switch(color) {
			case 1:
				colour = "red";
				break;
			case 2:
				colour = "green";
				break;
			case 3:
				colour = "blue";
				break;
			case 4:
				colour = "black";
				break;
			case 5:
				colour = "white";
				break;
			}
			pw.println("Rectangle drawn with upper upper-left corner at (" + x1 + ", " + y1 + ") and lower right corner at (" + x2 + ", " + y2 + "), and color " + colour);
			pw.close();
		}
	}
	
	public void fill(int color) {
		if(color < 1 || color > 5) {
			System.out.println("Invalid Color!!!");
		} else {
			try {
				pw = new PrintWriter(new FileOutputStream(myFile, true));
			}catch(FileNotFoundException e) {
				System.out.println("File cannot be found!!");
			}
			
			switch(color) {
			case 1:
				colour = "red";
				break;
			case 2:
				colour = "green";
				break;
			case 3:
				colour = "blue";
				break;
			case 4:
				colour = "black";
				break;
			case 5:
				colour = "white";
				break;
			}
			pw.println("Rectangle filled with upper upper-left corner at (" + x1 + ", " + y1 + ") and lower right corner at (" + x2 + ", " + y2 + "), and color " + colour);
			pw.close();
		}
	}
}
