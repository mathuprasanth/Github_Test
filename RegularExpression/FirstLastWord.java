package com.fita.team2.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLastWord {

	public static void main(String[] args) {
		String st="java is object oriented programming language";
		Pattern p=Pattern.compile("^java");
		Matcher m=p.matcher(st);
		
		while(m.find()) {
		System.out.println(m.group() + " is the  first word of String "
				+" and start at " + m.start());
		
		}
		
		Pattern k=Pattern.compile("language$");
		Matcher n=k.matcher(st);
		
		while(n.find()){
			System.out.println(n.group() + " is the last word of String"
					+" and start at " + n.start());
		}
		
		
	}

}
