package exception;

import java.util.Scanner;

public class Example1 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int res=a/0;
		System.out.println(res);
		sc.close();
		

	}

}
