package com.tns.lamda;
interface C
{
	String print(String message);
}

public class lambda5 {

	public static void main(String[] args) {
		// lambda expression
		C c=(String message)->
		{
			return message;
			
		};
		System.out.println("the name is: "+c.print("shankar"));
		
		

	}

}
