package com.indiabix.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Example5
{
	private static String regex="pyalace";
	private static String str="i love pyalace " + "it is famous in karnataka";
	private static String replace="aramane";

	public static void main(String[] args) 
	{
		try
		{
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(str);
			str=m.replaceAll(replace);
			System.out.println(str);
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("pattern syntax exception: "+e.getDescription());
			System.out.println("index:"+e.getIndex());
			System.out.println("message:"+e.getMessage());
		}
		

	}

}
