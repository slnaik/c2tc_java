package com.tns.inheritence;
class parent
{
	void print()
	{
		System.out.println("hello shankar");
	}
}
class child extends parent
{
	void display()
	{
		System.out.println("inheritence");
	}
}

public class Singleinheritence
{
	

	public static void main(String[] args) 
	{
		child c=new child();
		c.display();
		c.print();
		

	}

}
