package Assignment4;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class CellListUtilization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellList list1 = new CellList();
		CellList list2 = new CellList();
		Scanner sc = null;
		
		try {
			sc = new Scanner(new FileInputStream("Cell_Info.txt"));
		} catch(FileNotFoundException e){
			System.out.println("File Not Found!!!");
			System.exit(0);
		}
		
		long serial;
		String brand;
		double price;
		int year;
		while(sc.hasNextLine()) {
			serial = sc.nextLong();
			brand = sc.next();
			price = sc.nextDouble();
			year = sc.nextInt();
			CellPhone temp = new CellPhone(serial, brand, year, price);
			if(list1.containsDuplicate(temp)) {
				list2.addToStart(temp);	// Add to list of duplicated items
			} else {
				list1.addToStart(temp);	// Add to the list of unique items
			}
		}
		sc.close();
		
		System.out.println("Here is the list of unique items: ");
		list1.showContents();
		System.out.println("Here is the list of duplicated items: ");
		list2.showContents();
		System.out.println();
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the serial number you are looking for: ");
		long serialEntered = kb.nextLong();
		CellList.CellNode result = null;
		if(list1.contains(serialEntered)){
			result = list1.find(serialEntered);
			System.out.print("The cell phone you are looking for: ");
			System.out.println(result.getCellPhone().toString());
		} else {
			System.out.println("The serial number you are looking for is not in the list!");
		}
		System.out.println();
		
		list2.deleteFromStart();
		Scanner sc2 = null;
		try {
			sc2 = new Scanner(new FileInputStream("Cell_Info.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found!!!");
			System.exit(0);
		}
		
		while(sc2.hasNextLine()) {
			serial = sc2.nextLong();
			brand = sc2.next();
			price = sc2.nextDouble();
			year = sc2.nextInt();
			CellPhone temp = new CellPhone(serial, brand, year, price);
			if(list2.containsDuplicate(temp)) {
				continue;
			} else {
				list2.addToStart(temp);
			}
		}
		sc2.close();
		
		System.out.println();
		System.out.print("Please enter a serial number you want to check: ");
		serialEntered = kb.nextLong();
		if(list1.contains(serialEntered)) {
			System.out.println("The phone is in the list!");
		} else {
			System.out.println("The phone is not in the list!");
		}
		System.out.println();
		
		System.out.println("Testing Equals Method: ");
		System.out.println("Here is another list that was copied the same way: ");
		list2.showContents();
		System.out.print("Does this list equals to the previous list?");
		System.out.println(" " + list1.equals(list2));
		System.out.println();
		
		CellPhone testing = new CellPhone(1234567, "Random", 1111, 9.99);
		System.out.println("Testing addToStart Method");
		list2.addToStart(testing);
		list2.showContents();
		System.out.print("Does this list now equals to the previous list? ");
		System.out.println(list2.equals(list1));
		System.out.println("Done testing equals method!");
		System.out.println();
		
		list2.deleteFromStart();
		list2.insertAtIndex(3, testing);
		System.out.println("Testing deleteFromStart and insertAtIndex method: ");
		list2.showContents();
		System.out.println();
		
		CellPhone testing2 = new CellPhone(7891011, "NotRandom", 2222, 1.99);
		list2.replaceAtIndex(3, testing2);
		System.out.println("Testing replaceAtIndex method");	//Method deleteFromIndex is inside replaceAtIndex method so no need to test!
		list2.showContents();
		System.out.println();
		
		System.out.println("Done testing all methods!");
		kb.close();
	}

}
