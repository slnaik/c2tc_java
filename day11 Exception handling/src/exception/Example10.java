package exception;

import java.util.Scanner;
  //catch,finally,try

public class Example10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		try 
		{
			int res=a/5;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			System.out.println("Exception Handling in Java");
		}
		
		sc.close();
		

	}

}
