package com.tns.this1;

public class Example4 
{
	String str;
	Example4()
	{
		str="sharan";
	}
	Example4 get()
	{
		return this;
	}
	void disp()
	{
		System.out.println(str);
	}

	public static void main(String[] args)
	{
		
		Example4 e=new Example4()	;
		e.disp();
	}

}
