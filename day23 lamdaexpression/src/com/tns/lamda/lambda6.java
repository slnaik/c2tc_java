package com.tns.lamda;
interface D
{
	int mul(int x,int y);
}

public class lambda6 
{

	public static void main(String[] args)
	{
		//lambda return without return
		D s=(x,y)->(x*y);
		System.out.println(s.mul(20, 30));
		

	}

}
