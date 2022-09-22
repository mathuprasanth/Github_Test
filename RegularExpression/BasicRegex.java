package com.fita.team2.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegex {

	public static void main(String[] args) {
		String s="mathu,is,the,man,of,madness";
		Pattern p= Pattern.compile("ma");
		Matcher m=p.matcher(s);
		int count=0;
		while(m.find()) {
			count++;
			System.out.println(m.group()+"AND START AT"+m.start());
		}
		System.out.println(count);

	}

}
