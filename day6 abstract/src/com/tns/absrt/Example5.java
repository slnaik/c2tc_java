package com.tns.absrt;
class person
{
	person()
	{
		System.out.println("parent class constructor");
	}
}
class student extends person
{
	student()
	{
		super();
		System.out.println("child class constructor");
		
	}
}
public class Example5 {

	public static void main(String[] args) 
	{
		student c=new student();
		
		

	}

}
