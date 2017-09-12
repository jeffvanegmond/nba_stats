package nbastats;

public class Club {
	private int id;
	private String name;
	
	public Club(int id, String name) {
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
		if(other instanceof Club) {
			return this.id == ((Club) other).id;
		}
		return false;
	}
}
