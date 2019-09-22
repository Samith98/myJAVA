package com_1;

public class Player {
	
	private String Name;
	private int matchesPlayed;
	private int totalRuns;
	private String team;
	
	public Player(String name, int matchesPlayed, int totalRuns, String team) {
		super();
		Name = name;
		this.matchesPlayed = matchesPlayed;
		this.totalRuns = totalRuns;
		this.team = team;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
}
