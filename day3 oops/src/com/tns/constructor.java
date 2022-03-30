package com.tns;

public class constructor 
{
String str;
int a;
constructor(String st,int x)
{
	str=st;
	a=x;
}
void display()
{
	System.out.println(str+" "+a);
}
	public static void main(String[] args) 
	{
		constructor c=new constructor("welcome",11);
		c.display();
		
	}

}
