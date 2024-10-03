import java.util.ArrayList;

class Team{
	
	private String teamName;	
	private int rank;
	private String name;

	public Team (String teamName){
	 this.teamName = teamName;
	 this.rank = rank;
	 this.name = name;
	}

	public void setRank (int rank){
		this.rank = rank;
	}

ArrayList<String> playerName = new ArrayList<String>();

	public void addPlayer(String name){
		playerName.add(name);
	}
	



	public String toString(){

		String s = "Hold: " + this.teamName + ": " + this.rank + ". Player name:" + playerName;
		return s;
	}

	}

