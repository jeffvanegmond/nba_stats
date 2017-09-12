package nbastats;

public class Player {
	private int id;
	private String name;
	
	public Player(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + "(" + id + ")";
	}
	
	public boolean equals(Object other) {
		if(other instanceof Player) {
			return this.id == ((Player) other).id;
		}
		return false;
	}
}
