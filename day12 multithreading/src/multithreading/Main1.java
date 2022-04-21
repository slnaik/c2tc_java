package multithreading;

class Seller
{
	int value=1000;
	synchronized void cost(int value)
	{
		System.out.println("Spend value");
		if(this.value<value)
		{
			System.out.println("Less value");
			
			try
			{
				
			}
			
			catch(Exception e)
			{
				
			}
		}
		this.value=this.value-value;
		System.out.println("Process completed");
	}
	synchronized void paid(int value)
	{
		System.out.println("Get value");
		this.value=this.value+value;
		System.out.println("Completed");
	}
	
	
	
}


public class Main1 
{
	
	public static void main(String[] args) 
	{
		Seller c=new Seller();
		new Thread()
		{
			public void run()
			{
				c.cost(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.paid(10000);
			}
		}.start();
		
		

	}

}
