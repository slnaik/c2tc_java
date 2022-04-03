package com.tns.inheritence;
class celphones
{
	void message()
	{
		System.out.println("samsung");
	}
	void call()
	{
		System.out.println("shankar");
	}
}
class redmi extends celphones
{
	void face()
	{
		System.out.println("face lock");
	}
}
class oneplus extends celphones
{
	void games()
	{
		System.out.println("pubG");
	}
}


public class Hirarchicalinheritence {

	public static void main(String[] args)
	{
		oneplus o=new oneplus();
		o.games();
		o.message();
		o.call();
		redmi r=new redmi();
		r.face();
		
	}

}
