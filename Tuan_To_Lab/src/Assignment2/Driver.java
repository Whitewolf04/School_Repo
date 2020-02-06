package Assignment2;

import Airplane.Airplane;
import Copter.Helicopter;
import Copter.Quadcopter;
import Drone.AgriculturalDrone;
import Drone.MAV;
import uav.UAV;
import Multirotor.Multirotor;

public class Driver {
	public static void copyFlyingObject(FlyingObject[] array) {
		FlyingObject[] newArray = new FlyingObject[array.length];
		for(int i = 0; i < array.length; i++) {
			newArray[i] = array[i].clone();
		}
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
		System.out.println();
		
		FlyingObject[] myArray = {myPlane1, myPlane2, myPlane3, helicopter, helicopter2, quadcopter, multirotor, myUAV, myUAV2, myUAV3,
									agriculturalDrone, whatDrone, thisDrone, mav, myMAV};
		searchPrice(myArray);
	}
	
	public static void searchPrice(FlyingObject[] a) {
		boolean pass = false;
		int count = 0;
		int minimumIndex = -1, minimumIndexSec = -1;
		do {
			FlyingObject[] custom;
			
			if(count == 0) {
				custom = new FlyingObject[a.length];
				for(int k = 0; k < a.length; k++) {
					custom[k] = a[k].clone();
				}
			} else{
				pass = true;
				custom = new FlyingObject[a.length - 1];
				for(int k = 0; k < custom.length; k++) {
					if(k < minimumIndex) {
						custom[k] = a[k].clone();
					} else{
						custom[k] = a[k+1].clone();
					}
				}
			}
			
			double minimumPrice = custom[0].getPrice();
			
			for(int i = 0; i < custom.length; i++) {
				if(custom[i].getPrice() < minimumPrice) {
					minimumPrice = custom[i].getPrice();
					if(count == 0) {
						minimumIndex = i;
					}else {
						minimumIndexSec = i >= minimumIndex? i+1 : i;
					}
				}
			}

			for(int k = 0; k < custom.length; k++) {
				if(custom[k].getPrice() == minimumPrice) {
					if(count == 0) {
						System.out.println(custom[k] + "\t\t-\tIndex: " + minimumIndex);
					}else {
						System.out.println(custom[k] + "\t\t-\tIndex: " + minimumIndexSec);
					}
				}
			}
			
			count++;
		}while(!pass);
	}

}
