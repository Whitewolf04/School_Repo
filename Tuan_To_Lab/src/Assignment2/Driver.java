package Assignment2;

import Airplane.Airplane;
import Copter.Helicopter;
import Copter.Quadcopter;
import Drone.AgriculturalDrone;
import Drone.MAV;
import uav.UAV;
import Multirotor.Multirotor;

public class Driver {
	public static FlyingObject[] copyFlyingObject(FlyingObject[] array) {
		FlyingObject[] newArray = new FlyingObject[array.length];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = new FlyingObject(array[i]);
		}
		return newArray;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println(myPlane1);
		System.out.println(helicopter);
		System.out.println(quadcopter);
		System.out.println(multirotor);
		System.out.println(myUAV);
		System.out.println(agriculturalDrone);
		System.out.println(mav);
		System.out.println("----------------------------------------------");
		System.out.println("Search price method:");
		
		FlyingObject[] myArray = {myMAV, myPlane1, myPlane2, myPlane3, helicopter, helicopter2, quadcopter, multirotor, myUAV, myUAV2, myUAV3,
									agriculturalDrone, mav, whatDrone, thisDrone};
		searchPrice(myArray);
		System.out.println("---------------------------------------------");
		
		FlyingObject[] copyCat = copyFlyingObject(myArray);
		System.out.println("Copy of the original array:");
		for(FlyingObject f: copyCat) {
			System.out.println(f);
		}
		/* This copy is not successful because it can only copy the attribute that exist in the super class FlyingObject.This happens 
		 * because polymorphism does not apply to copy constructors, so copyFlyingObject method only uses the copy constructor of FlyingObject Class
		 */
	}
	
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
		
		System.out.println(newArray[(newArray.length - 1)] + "\t\t-\tindex: " + indexCheapest);
		System.out.println(newArray[newArray.length - 2] + "\t\t-\tindex: " + index2ndCheapest);
	}

}
