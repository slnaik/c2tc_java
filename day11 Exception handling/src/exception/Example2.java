package exception;

public class Example2
{

	public static void main(String[] args)
	{
		System.out.println("First Line");
		System.out.println("Second Line");
		int[] myIntArray=new int[] {1,2,3,4};
		
		try
		{
			System.out.println(myIntArray);

		}
		
		catch(Exception e)
		{
			System.out.println(e);
		

		}
		System.out.println("Third Line");

	}
	public static void ptint(int[] arr)
	{
		System.out.println(arr[3]);
		System.out.println("Fourth Element Successfully displayed!");
	}

}