package model;


public class Team{
	
	String teamName;
	String coachName;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public Team(String teamName, String coachName) {
		super();
		this.teamName = teamName;
		this.coachName = coachName;
	}
	
}
