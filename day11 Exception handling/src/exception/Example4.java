package exception;
public class Example4
{

	public static void main(String[] args)
	{
		try 
		{
			int num=120/0;
			System.out.println(num);
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
