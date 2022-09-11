package com.fita.team2.WORKOUT;

import java.util.Scanner;

interface NonVeg {
	void Chicken();
	void Mutton();
	void Beef();
	void fish();
	
}
abstract class last{
    abstract void thank();
}

public class MEAT extends last implements NonVeg {	

	@Override
	void thank() {
		System.out.println("\nWELCOME COME AGINE");
		
	}

	@Override
	public void fish() {
		int price3=400;
		System.out.println("Fish is available 1kg price=" + price3);
		
	}

	@Override
	public void Beef() {
		int price2=700;	
		System.out.println("Beef is available 1kg price=" + price2);
		
	}

	@Override
	public void Chicken() {
		int price1=200;
		System.out.println("Chicken is available 1Kg price=" + price1);
		
	}

	@Override
	public void Mutton() {
     int price=800;
     
     System.out.println("Mutton is available 1kg price=" + price);

		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		MEAT ch=new MEAT();
		System.out.println("\nWELCOME TO BEST MEET SHOP");
		System.out.println("You Want Chicken Enter-1\nYou Want Mutton Enter-2\nYou Want Beef Enter-3\nYou Want fish Enter-4");
		int i=s.nextInt();
		if(1==i) {
			ch.Chicken();
		}
		else if(2==i){
			ch.Mutton();
		}
		else if(3==i) {
			ch.Beef();
		}
		else if(4==i) {
			ch.fish();
		}
		else {
				System.out.println("MEET NOT AVAILABLE");
		}
	
	
		System.out.println("\nHow Many KG You Want");
		float j=s.nextInt();
		int chicken=200;
		int mutton=800;
		int beef=700;
		int fish=400;
		
		if(1==i) {
			System.out.println("YOU PAY JUST=" + j*chicken);
		}
		else if(2==i) {
			System.out.println("YOU PAY JUST=" + j*mutton);
			}
		else if(3==i) {
			System.out.println("YOU PAY JUST=" + j*beef);
			
		}
		else if(4==i) {
			System.out.println("YOU PAY JUST=" + j*fish);
			
		}else {
			System.out.println("DONT PAY");
		}
		
		System.out.println("take your meat");
		
		ch.thank();

	}



	


}
