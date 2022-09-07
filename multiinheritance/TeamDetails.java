package com.fita.team2.multiinheritance;

public class TeamDetails extends Team{
	 String teamname=team;
	 String Player=playername;
	 int soloScore=SingleScore;
	 int teamtotal=179;
	 
	 public TeamDetails() {
		 System.out.println("full team details");
	 }
	 
	
	public void Addall() {
		 System.out.println(Player + " scored " + soloScore + " for " + teamname + " and team total score is " + teamtotal);
	 } 
	 public TeamDetails(String TN,String PN,int SS,int TT ) {
		 this.teamname=TN;
		 this.Player=PN;
		 this.soloScore=SS;
		this.teamtotal=TT;
	 }
	 

	public static void main(String[] args) {
		TeamDetails td=new TeamDetails();
		
		TeamDetails td1=new TeamDetails("AKCC","logu",79,200);
	td.Addall();
		td1.Addall();
}

}
