package com.tns;
public class constructor2 
{
String str;
int a,x;
constructor2()
{
	str="welcome";
	a=57;
	x=34;
}
void display()
{
	System.out.println(str+" "+a+"   "+x);
}
	public static void main(String[] args) 
	{
		constructor2 c=new constructor2();
		c.display();
		
	}

}


	

//non parameterized