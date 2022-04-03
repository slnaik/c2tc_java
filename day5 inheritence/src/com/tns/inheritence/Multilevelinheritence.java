package com.tns.inheritence;
class dog
{
	void print()
	{
		System.out.println("i like dogs");
	}
}
class cat extends dog
{
	void display()
	{
		System.out.println("i like cats");
	}
}
class horse extends cat
{
	void assign()
	{
		System.out.println("this is very expesive");
	}
}








public class Multilevelinheritence {

	public static void main(String[] args)
	{
	horse h=new horse();
	h.assign();
	h.print();
	h.display();

	}

}
