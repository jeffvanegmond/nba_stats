package nbastats;

import java.util.Date;

public class Contract {
	private Player player;
	private Club club;
	private Date startOfContract;
	private Date endOfContract;
	
	public Contract(Player player, Club club, Date start) {
		this(player, club, start, null);
	}
	
	public Contract(Player player, Club club, Date start, Date end) {
		this.player = player;
		this.club = club;
		this.startOfContract = start;
		this.endOfContract = end;
	}
	
	public Date getEndOfContract() {
		return endOfContract;
	}

	public void setEndOfContract(Date endOfContract) {
		this.endOfContract = endOfContract;
	}

	public Player getPlayer() {
		return player;
	}

	public Club getClub() {
		return club;
	}

	public Date getStartOfContract() {
		return startOfContract;
	}
	
	public void finalizeContract(Date end) {
		if(!hasEnded()) {
			setEndOfContract(end);
		}
	}
	
	public boolean openEnded() {
		return endOfContract == null;
	}
	
	public boolean hasEnded() {
		if(openEnded()) {
			Date now = new Date();
			return now.after(endOfContract);
		}
		return false;
	}
}
