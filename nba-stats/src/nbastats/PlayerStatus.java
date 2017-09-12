package nbastats;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayerStatus {
	private Player player;
	private Contract mostRecentContract;
	private List<Contract> history;
	
	public PlayerStatus(Player player) {
		history = new ArrayList<Contract>();
	}
	
	public boolean hasContract() {
		return mostRecentContract != null && !mostRecentContract.hasEnded();
	}
	
	public void addNewContract(Club club, Date start) {
		addNewContract(club, start, null);
	}
	
	public void addNewContract(Club club, Date start, Date end) {
		finalizeRecentContract(start);
		Contract newContract = new Contract(this.player, club, start, end);
		this.mostRecentContract = newContract;
		this.history.add(newContract);
	}

	private void finalizeRecentContract(Date endDate) {
		if(this.mostRecentContract != null) {
			this.mostRecentContract.finalizeContract(endDate);
		}
	}
	
}
