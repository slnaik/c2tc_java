package com.tns.absrt;
class parent
{
	void disp()
	{
		System.out.println("parent class");
	}
}
class child extends parent
{
	void disp()
	{
	System.out.println("child  class");
	}
	void display()
	{
	disp();
	super.disp();
	}
}
public class Example4 
{

	public static void main(String[] args) 
	{
	child c=new child();
	c.display();

	}

}
