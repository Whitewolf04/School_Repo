package Lab11;

public class LinkedList {
	public class Node{
		private Player player;
		private Node next;
		
		public Node(Player plr, Node next) {
			player = new Player(plr);
		}
		
		public String toString() {
			return(this.player.toString());
		}
	}
	
	private Node head;
	private int size;
	private Player[] myList;
	
	public LinkedList(int size) {
		this.size = size;
		myList = new Player[size];
	}
	
	public void insert(Player p) {
		
	}
	
	
}
