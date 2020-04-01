package Lab10;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class Circle implements Fillable{
	private double radius, X, Y;
	private PrintWriter pw = null;
	private File myFile = new File("Draw.txt");
	private String colour;
	
	public Circle(double radius, double X, double Y) {
		this.radius = radius;
		this.X = X;
		this.Y = Y;
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
			pw.println("Circle drawn at (" + X + ", " + Y + ") with radius " + radius + ", and color " + colour);
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
			pw.println("Circle filled at (" + X + ", " + Y + ") with radius " + radius + ", and color " + colour);
			pw.close();
		}
	}
}
