package array;

import java.util.Scanner;

public class Example4 
{

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();//It will print the next array value
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		s.close();
	}

}
