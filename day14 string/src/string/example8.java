package string;

import java.util.StringTokenizer;

public class example8 
{

	public static void main(String[] args) 
	{
		
		StringTokenizer st=new StringTokenizer("Lets try this");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		

	}

}
