package com.fita.team2.Interface;


interface Bus{
	void Busname();
	void BusRoute();
	 default void Travel(){
		 System.out.println("TRAVEL Vlogs");
	 }
}
interface Kangayam{
	void KgmStart();
	void KgmEnd();
	default void Route2(){
		System.out.println("\nKANGAYAM To COIAMBATORE");
	}
	default void Ticket2() {
		System.out.println("\nKGM To CBE");
	}
}
interface passengers2{
	void passen2();
}
interface BusTime{
	void StratTime();
	void EndTime();
	
default void ticketPrice(){
		System.out.println("\nErode to CBE Ticket Price is 65");
	}
}
abstract class Passengers{
	abstract void passengername();
	
}
class Transport extends Passengers implements Bus,BusTime,passengers2,Kangayam{

	@Override
	public void Busname() {
		System.out.println("\nSCP Transports");
	}

	@Override
	public void BusRoute() {
		System.out.println("\nERODE To COIAMBATORE");
		
	}

	@Override
	public void StratTime() {
		System.out.println("\nBus start from ERODE 2.00PM");
		
	}

	@Override
	public void EndTime() {
	
		System.out.println("\nBus reach To COIAMBATORE 4.00PM");
		
	}

	@Override
	void passengername() {
		System.out.println("\nErode to CBE Passengers names");
		
		System.out.println("Boopathi");
		System.out.println("Ajith");
		System.out.println("MathuPrasanth");
		System.out.println("Vishnu");
		
	}

	@Override
	public void passen2() {
		System.out.println("\nKGM to CBE passengers names");
		
		System.out.println("loganathan");
		System.out.println("Kamalesh");
		System.out.println("Dheena");
	}

	@Override
	public void KgmStart() {
		System.out.println("\nBus Start From KGM 3:00 PM");
		
	}

	@Override
	public void KgmEnd() {
		System.out.println("\nBus Reach To CBE 5:00 PM");
		
	}
	
}

public class localBus {

	public static void main(String[] args) {
	
		Transport t = new Transport();
		t.Travel();
		t.Busname();
		t.BusRoute();
		t.ticketPrice();
		t.StratTime();
		t.passengername();
		t.EndTime();
		t.Route2();
		t.Ticket2();
		t.KgmStart();
		t.passen2();
		t.KgmEnd();
		
		

	}

}
