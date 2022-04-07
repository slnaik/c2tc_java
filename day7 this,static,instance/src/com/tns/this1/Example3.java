package com.tns.this1;

public class Example3 
{
	void print(Example3 e)
	{
		System.out.println("dfs developer");
	}
	void disp()
	{
		print(this);
	}

	public static void main(String[] args) 
	{
		
		Example3 e=new Example3()	;
		e.disp();
	}

}
