package com.tns.enum1;

public class Example2 {
	enum margin
	{
		top,bottom,right,left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(margin m:margin.values())
		{
			System.out.printf("margin %d=%s\n",count++,m);
		}

	}

}
