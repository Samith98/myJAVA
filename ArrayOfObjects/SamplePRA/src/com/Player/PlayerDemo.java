package com_1;

public class PlayerDemo {

	public static void main(String[] args) {

		Player player1= new Player("valyyhz",59,57,"houuyon"); 
		Player player2= new Player("rcsofeq",71,36,"tnrscrk"); 
		Player player3= new Player("yyhaxtd",91,2,"nejgswo"); 
		Player player4= new Player("lyqemyr",22,96,"cymugfd"); 
		Player player5= new Player("xftaapa",31,95,"wgdpbwg"); 
		
		Player[] objArray= {player1,player2,player3,player4,player5}; 
		
		Player playerRes1= new Player("yyhaxtd",84,20,"mztqvxs"); 
		
		Player player = PlayerDemo.findPlayerWithMaximumRuns(objArray); 
		
		System.out.println(player.getName()+" " + player.getMatchesPlayed()+" " + player.getTotalRuns()+" " + player.getTeam());
		
		Player updatedPlayers[]= PlayerDemo.replacePlayerByName(objArray, playerRes1); 
		
		for(Player updatedPlayer : updatedPlayers){ 
			if(updatedPlayer.getName().equals(playerRes1.getName())){ 
				System.out.println(updatedPlayer.getName()+" " + updatedPlayer.getMatchesPlayed()+" " + updatedPlayer.getTotalRuns()+" " + updatedPlayer.getTeam());
			} 
		}		
	}
	
	public static Player findPlayerWithMaximumRuns(Player[] players) {
		
		if(players == null) {
			return null;
		}
		
		int i = 0;
		int len = players.length;
		int index = 0;
		
		int  max = players[0].getTotalRuns();
		for(i=1; i<len; i++) {
			if(players[i].getTotalRuns()>max) {
				max = players[i].getTotalRuns();
				index = i;
			}
		}
		return players[index];
	}
	
	public static Player[] replacePlayerByName(Player[] players, Player newPlayer) {
		
		if(players == null) {
			return null;
		}
		
		int i = 0;
		int len = players.length;
		
		for(i=0; i<len; i++) {
			if(players[i].getName() == newPlayer.getName()) {
				players[i] = newPlayer;
			}
		}
		return players;
	}
}
