package com.fita.team2.multiinheritance;

public class Cricket {

	String teamname="MBCC";
	String player="Mathu";
	int score=88;
	
Cricket(){
	System.out.println("Cricket class displayed");
}
public void Change(String Tname,String player,int Run) {
	
	this.teamname=Tname;
	this.player=player;
	this.score=Run;
}
}