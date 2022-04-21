package exception;

public class Example5
{

	public static void main(String[] args)
	{
		try 
		{
			int num=120/5;
			System.out.println(num);
			System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number should not be devided by zero");
		}
		finally
		{
			System.out.println("This is finally block ");
		}
		System.out.println("Out of try=catch-finally ");

		
		


	}

}
