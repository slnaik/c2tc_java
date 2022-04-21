package exception;

import java.io.IOException;

public class Example8
{
	void myMethod(int num)throws IOException,ClassNotFoundException
	{
		if (num==1)
			throw new IOException("IOException");
			throw new ClassNotFoundException("ClassnotFoundException");
	}
	public static void main(String[] args) 
	{

		try 
		{Example8 obj=new Example8();
		obj.myMethod(1);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
