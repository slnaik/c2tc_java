package com.tns.absrt;

abstract class animal
{
	abstract void eat();
}
class birds extends animal
{
	void eat()
	{
		System.out.println("i am non vegiterian");
	}
}
class dogs extends animal
{
	void eat()
	{
		System.out.println("i am  vegiterian");
	}
}

public class Example1 
{

	public static void main(String[] args)
	{
	animal b=new birds();
	animal d=new dogs();
	b.eat();
	d.eat();

	}

}
