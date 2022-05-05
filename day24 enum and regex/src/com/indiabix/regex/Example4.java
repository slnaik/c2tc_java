package com.indiabix.regex;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str ="batch 1-4 cg1.1\r\nshankar \r\nreshma";
		
		String[] res=str.split("\\r?\\n");
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}
