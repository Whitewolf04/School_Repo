
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c1 = new Cylinder(6, 7);
		Cylinder c2 = new Cylinder(c1);
		Cylinder[] cList = {c1, c2};
		
		System.out.println(c1.getHeight());
		System.out.println(c1 + "\n" + c2);
		System.out.println(c1.equals(c2));
		
		c2.setHeight(9.5);
		c2.setRadius(3.2);
		System.out.println(c1.equals(c2));
		System.out.println(c2.getArea());
		
		System.out.println(Cylinder.getTotalArea(cList));
	}

}
