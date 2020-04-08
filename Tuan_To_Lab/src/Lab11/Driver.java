package Lab11;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myList = new LinkedList(5);
		Player player1 = new Player("Ronaldo", 3000);
		Player player2 = new Player("Viera", 2200);
		Player player3 = new Player("Courtois", 1500);
		Player player4 = new Player("Luiz", 500);
		Player player5 = new Player("Gullit", 2500);
		
		myList.insert(player1);
		myList.insert(player2);
		myList.insert(player3);
		myList.insert(player4);
		myList.insert(player5);
		
		System.out.println("* Here is the list: ");
		System.out.println(myList);
		System.out.println("* End of the list!");
		System.out.println();
		
		myList.remove(player3);
		
		System.out.println("Player: " + player3 + " is removed from the list");
		System.out.println("*Here is the list after removing the player: ");
		System.out.println(myList);
		System.out.println("*End of list");
		System.out.println();
		System.out.println("\t\t End of program!!!");
		
	}

}
