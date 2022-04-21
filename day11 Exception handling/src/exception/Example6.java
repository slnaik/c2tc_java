package exception;
public class Example6
{
	
	public static void main(String[] args)
	{
		
	System.out.println(Example6.myMethod());
    }
	public static int myMethod()
	{
		
	try 
	{

		//int x=63;
		//int y=0;
		//int z=x/y;
		System.out.println("Inside try block");
		System.exit(0);
	}
	
	catch(ArithmeticException exp)
	{
		System.out.println(exp);
	}
	finally
	{
		System.out.println("java finally block ");
	}
	return 0;

	
	


}

}
