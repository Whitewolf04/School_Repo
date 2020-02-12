package Assignment2;

//--------------------------------------------------
// Part: Driver Program
// Written by: Tuan To || 40114920
//--------------------------------------------------

import Airplane.Airplane;
import Copter.Helicopter;
import Copter.Quadcopter;
import Drone.AgriculturalDrone;
import Drone.MAV;
import Flying_Object.FlyingObject;
import uav.UAV;
import Multirotor.Multirotor;

public class Driver {
	
	// copyFlyingObject method which uses the copy constructor of the classes created
	public static FlyingObject[] copyFlyingObject(FlyingObject[] array) {
		FlyingObject[] newArray = new FlyingObject[array.length];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = new FlyingObject(array[i]);
		}
		return newArray;
		
		
	}
	
	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating 15 objects from the classes created
		Airplane myPlane1 = new Airplane("Boeing", 1000000.99, 2000);
		Airplane myPlane2 = new Airplane("Airbus", 1012311.89, 1950);
		Airplane myPlane3 = new Airplane("Airbus", 1012310, 1950);
		Helicopter helicopter = new Helicopter("Hawk", 894000.98, 1500, 23, 2006, 5);
		Helicopter helicopter2 = new Helicopter("Hawk", 894000.98, 1500, 23, 2006, 5);
		Quadcopter quadcopter = new Quadcopter("Eagle", 598000.56, 1467, 18, 2007, 2, 120);
		Multirotor multirotor = new Multirotor("Crane", 467000, 1370, 14, 2003, 4, 6);
		UAV myUAV = new UAV(500.67, 1763.89);
		UAV myUAV2 = new UAV(670.5, 1800);
		UAV myUAV3 = new UAV(670.5, 1800.98);
		AgriculturalDrone agriculturalDrone = new AgriculturalDrone(400, 1200, "Oracle", 50);
		AgriculturalDrone whatDrone = new AgriculturalDrone(500, 1150, "Oracle", 65);
		AgriculturalDrone thisDrone = new AgriculturalDrone(500, 1150, "Oracle", 65);
		MAV mav = new MAV(375, 1005.6, "1.0.3", 60);
		MAV myMAV = new MAV(375, 1009.99, "1.0.3", 60);
		
		// Test out the toString method of the classes created
		System.out.println("Testing out toString method of all classes: ");
		System.out.println(myPlane1);
		System.out.println(helicopter);
		System.out.println(quadcopter);
		System.out.println(multirotor);
		System.out.println(myUAV);
		System.out.println(agriculturalDrone);
		System.out.println(mav);
		System.out.println("----------------------------------------------");
		
		// Test out the equal method as discussed
		System.out.println("Testing the equals method of some classes: ");
		System.out.println((myPlane2.equals(myPlane3))? "myPlane2 is the same as myPlane 3": "myPlane2 is different from myPlane 3");
		System.out.println((helicopter.equals(helicopter2))? "Helicopter is the same as Helicopter2": "Helicopter is different from Helicopter2");
		System.out.println((myUAV2.equals(myUAV3))? "UAV2 is the same as UAV3": "UAV2 is different from UAV3");
		System.out.println((thisDrone.equals(whatDrone))? "whatDrone is the same as thisDrone": "whatDrone is different from thisDrone");
		System.out.println("-----------------------------------------------");
		
		// Trace the prices to find the least expensive and second least expensive
		System.out.println("Search price method:");
		FlyingObject[] myArray = {myMAV, myPlane1, myPlane2, myPlane3, helicopter, helicopter2, quadcopter, multirotor, myUAV, myUAV2, myUAV3,
									agriculturalDrone, mav, whatDrone, thisDrone};
		searchPrice(myArray);
		
		System.out.println("---------------------------------------------");
		
		// Test out the copyFlyingObject method
		FlyingObject[] copyCat = copyFlyingObject(myArray);
		System.out.println("Copy of the original array:");
		for(FlyingObject f: copyCat) {
			System.out.println(f);
		}
		/* This copy is not successful because it can only copy the attribute that exist in the super class FlyingObject.This happens 
		 * because polymorphism does not apply to copy constructors, so copyFlyingObject method only uses the copy constructor of FlyingObject Class
		 */
		
		System.out.println();
		System.out.println("\t\t\t\tEnd of Program!!!");
	}
	
	// searchPrice method to trace the prices of the created array of objects
	public static void searchPrice(FlyingObject[] a) {
		FlyingObject[] newArray = FlyingObject.sort(a);
		int indexCheapest = -1, index2ndCheapest = -1;
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals(newArray[(newArray.length - 1)])) {
				indexCheapest = i;
			} else if(a[i].equals(newArray[newArray.length - 2])) {
				index2ndCheapest = i;
			}
		}
		
		// Print out the two least expensive item together with their index in the original array
		System.out.println(newArray[(newArray.length - 1)] + "\t\t-\tindex: " + indexCheapest);
		System.out.println(newArray[newArray.length - 2] + "\t\t-\tindex: " + index2ndCheapest);
	}

}
