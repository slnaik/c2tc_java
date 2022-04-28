package com.tns.lamda;
interface S
{
	void show(int i);
}

public class lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S ab=(int i)->
		{
			
				System.out.println("welcome to lambda "+i);
			
		};
		ab.show(10);

	}

}
//lamda expression with one parameter//