package com.tns;

public class Car1
{
	String str;
	Car1(String s)
	{
		str=s;
	}
	void display()
	{
		System.out.println("this is "+str);
	}

	public static void main(String[] args) 
	{
		Car1 a=new Car1("audi");
		Car1 m=new Car1("mercedes");
		Car1 b=new Car1("bmw");
		a.display();
		m.display();
		b.display();
		
	}

}
