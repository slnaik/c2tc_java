package recursion;

import java.util.Scanner;

public class Factorial
{
	//function definition
	 static int factorial(int n)
	{
		 if(n==1)
		 {
			 return 1;
		 }
		 else
		 {
			 return n*factorial(n-1);
		 }
		
	}
	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(factorial(n));//Function call
		s.close();
		
	}
	
}
