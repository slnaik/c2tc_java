package com.indiabix.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("s");
		Matcher m=p.matcher("i love bangalore and its famous for sandalwood");
		while(m.find())
		{
			System.out.println("patten found from"+m.start()+ " to " +(m.end()-1));
		}
	}

}
