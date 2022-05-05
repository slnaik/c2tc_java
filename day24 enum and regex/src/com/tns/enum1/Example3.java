package com.tns.enum1;
 enum bike
{
	pulser,ktm,r15,r3,re;
}

public class Example3 {

	public static void main(String[] args)
	{
		
		bike c=bike.re;
		switch(c)
		{
		case pulser:
		System.out.println("you choose pulser");
		break;
		case ktm:
		System.out.println("you choose pulser");
		break;
		case r15:
		System.out.println("you choose r15");
		break;
		case r3:
		System.out.println("you choose r3");
		break;
		default:System.out.println("invalid ");
		
		}

	}

}
