package com.tns.lamda;

public class lambda7 {

	public static void main(String[] args) {
		// thread without lambda expression
		/*Runnable r=new Runnable()
				{
			public void run()
			{
				System.out.println("class name is : lambda7");
			}
			
				};*/
				//using lambda expression
				Runnable r=()->
				{
					System.out.println("class name is : lambda7");
				};
				Thread t=new Thread(r);
				t.start();

	}

}
