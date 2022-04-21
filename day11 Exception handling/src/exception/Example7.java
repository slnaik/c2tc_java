package exception;

public class Example7 
{
	 static void display(int age,int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("you are eiligible to donate blood");
		}
		throw new ArithmeticException(" Not Eligible");
		
	}

	public static void main(String[] args)
	{
		display(16,55);//if you pass the value less than 18 it will throw Exception
		System.out.println("Exception Handled");

	}

}
