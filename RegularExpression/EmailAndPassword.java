package com.fita.team2.RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAndPassword {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		
		   System.out.println("ENTER THE USER ID:");
		   
		String uid=n.nextLine();
		
		   System.out.println("ENTER THE PASSWORD:");
		    
		 String pass=n.nextLine();
		
		Pattern x=Pattern.compile("[a-zA-Z0-9]");
		
		Matcher m=x.matcher(uid);
		
		System.out.println(m.find());
		 
		Pattern y=Pattern.compile("[a-z0-9][!@#$%^&*]");
		
		
		Matcher o=y.matcher(pass);
		
		System.out.println(o.find());
		
		
		if(m.find()||o.find()) {
			
			System.out.println("Login Succesfully");
		}
		else
		{
			System.out.println("[invalid] --->(LOGIN FAILD)");
			System.out.println("Please Check your USERNAME AND PASSWORD ");
		}
		
		
	}
}
		
