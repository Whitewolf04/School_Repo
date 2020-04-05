package Lab11;

public class Player implements Comparable<Player>, Cloneable{
	private int health;
	private String name;
	
	public Player(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	public Player(Player plr) {
		this.name = plr.name;
		this.health = plr.health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return("Name: " + this.name + "\tHealth: "+ health);
	}
	
	public int compareTo(Player plr) {
		if(plr.health < this.health) {
			return 1;
		} else if(plr.health > this.health) {
			return -1;
		} else {
			return 0;
		}

	}
	
	public Player clone() {
		return(new Player(this));
	}
}
