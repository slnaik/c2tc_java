package com.tns.lamda;
interface B
{
	abstract void disp(int a,int b);
}

public class lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B s=(int a,int b)->
		{
			System.out.println("addition of a and b is: "+a*b);
		};
		s.disp(5, 10);

	}

}
