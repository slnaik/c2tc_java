package com.tns.absrt;
class A
{
	String name="shankar";
}
class B extends A
{
	String name="ram";
	void print()
	{
		System.out.println("i am "+name);
		System.out.println("i am "+super.name);
	}
}

public class Example3 {

	public static void main(String[] args) {
		B b=new B();
		b.print();

	}

}
