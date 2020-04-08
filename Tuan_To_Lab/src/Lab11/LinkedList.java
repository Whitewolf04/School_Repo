package Lab11;

public class LinkedList {
	public class Node{
		private Player player;
		private Node next;
		
		public Node() {
			player = null;
			next = null;
		}
		
		public Node(Player plr, Node link) {
			player = new Player(plr);
			next = link;
		}
		
		public String toString() {
			return(this.player.toString());
		}
	}
	
	private Node head;
	private int size;
	private int count = 0;
	
	public LinkedList(int size) {
		this.size = size;
		head = null;
	}
	
	public LinkedList(int size, Node head) {
		this.size = size;
		this.head = head;
		if(head != null) {
			count++;
		}
	}
	
	public boolean insert(Player p) {
		boolean inserted = false;
		if(head == null) {
			head = new Node(p, head);
		} else if(head.next == null) {
			if(p.compareTo(head.player) == -1  && size >= 2) {
				head = new Node(p, head);
				inserted = true;
				count++;
			} else if(size >= 2){
				head.next = new Node(p, null);
				inserted = true;
				count++;
			}
		} else {
			Node position = head.next;
			Node previousPos = head;
			while(position != null) {
				if(p.compareTo(previousPos.player) == -1 && count < size && previousPos == head) {
					count++;
					head = new Node(p, head);
					inserted = true;
					break;
				} else if(p.compareTo(position.player) == -1  && count < size) {
					count++;
					position = new Node(p, position);
					previousPos.next = position;
					inserted = true;
					break;
				} else {
					previousPos = previousPos.next;
					position = position.next;
				}
			}
		}
		return inserted;
	}
	
	public boolean remove(Player p) {
		boolean removed = false;
		
		if(head == null) {
			System.out.println("List empty!!");
		} else if(head.next == null) {
			if(head.player.equals(p)) {
				removed = true;
				count--;
			}
		} else {
			Node previousPos = head;
			Node position = head.next;
			while(position != null) {
				if(previousPos.player.equals(p) && previousPos == head) {
					head = head.next;
					removed = true;
					count--;
					break;
				} else if(position.player.equals(p)) {
					previousPos.next = position.next;
					position.next = null;
					removed = true;
					count--;
					break;
				} else {
					previousPos = previousPos.next;
					position = position.next;
				}
			}
		}
		return removed;
	}
	
	public String toString() {
		Node position = head;
		String result = "";
		while(position != null) {
			result += position.toString() + "\n";
			position = position.next;
		}
		return result;
	}
}
