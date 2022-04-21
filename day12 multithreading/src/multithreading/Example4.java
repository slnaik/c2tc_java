package multithreading;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread interruption");
	}
}

public class Example4 
{

	public static void main(String[] args)
	{
		
		Thread1 t1=new Thread1();
		t1.start();
		//System.out.println("Is thread interrupted " + t1.interrupted());
		t1.interrupt();
		//System.out.println("Is thread interrupted "+ t1.interrupted());
		t1.interrupt();

		

	}

}
