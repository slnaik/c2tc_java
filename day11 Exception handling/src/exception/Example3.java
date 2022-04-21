package exception;

public class Example3 {

	public static void main(String[] args) {
		

		try 
		{
			int data=30/3;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always excecuted");
		}
	
		

	}

}
