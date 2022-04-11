package interface1;

class Main implements Example{
	public void display()
	{
		System.out.println("c2tc");
	}
	/*public void print()
	{
		System.out.println("Everything is going well and good");
	}*/
	
	public static void main(String args[])
	{
		Main m=new Main();
		m.display();
		//m.print();
	}
}
