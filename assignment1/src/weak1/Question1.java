package weak1;

import java.util.Scanner;
public class Question1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
		do 
		{
			
				System.out.println(++a);
			
		}
		while (a<=50);
		
		sc.close();
	}

}
