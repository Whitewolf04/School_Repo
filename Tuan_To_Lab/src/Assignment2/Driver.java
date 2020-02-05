package Assignment2;

import Airplane.Airplane;
import Copter.Helicopter;
import Copter.Quadcopter;
import Drone.AgriculturalDrone;
import Drone.MAV;
import uav.UAV;
import Multirotor.Multirotor;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane myPlane1 = new Airplane("Boeing", 1000000.99, 2000);
		Airplane myPlane2 = new Airplane("Airbus", 1012311.89, 1950);
		Airplane myPlane3 = new Airplane();
		Helicopter helicopter = new Helicopter("Hawk", 894000.98, 1500, 23, 2006, 5);
		Helicopter helicopter2 = new Helicopter("Hawk", 894000.98, 1500, 23, 2006, 5);
		Quadcopter quadcopter = new Quadcopter("Eagle", 598000.56, 1467, 18, 2007, 2, 120);
		Multirotor multirotor = new Multirotor("Crane", 467000, 1370, 14, 2003, 4, 6);
		UAV myUAV = new UAV(500.67, 1763.89);
		UAV myUAV2 = new UAV(670.5, 1800);
		UAV myUAV3 = new UAV();
		AgriculturalDrone agriculturalDrone = new AgriculturalDrone(400, 1200, "Oracle", 50);
		AgriculturalDrone whatDrone = new AgriculturalDrone(500, 1150, "Oracle", 65);
		AgriculturalDrone thisDrone = new AgriculturalDrone(500, 1150, "Oracle", 65);
		MAV mav = new MAV(375, 1005.6, "1.0.3", 60);
		MAV myMAV = new MAV();
		
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
		double minimumPrice = a[0].getPrice();
		int minimumIndex = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i].getPrice() < minimumPrice) {
				minimumPrice = a[i].getPrice();
				minimumIndex = i;
			}
		}
		
		for(int r = 0; r < )
		
		for(int k = 0; k < a.length; k++) {
			if(a[k].getPrice() == minimumPrice) {
				System.out.println(a[k]);
			}
		}
	}

}
