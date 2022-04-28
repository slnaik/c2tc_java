package com.tns.lamda;
interface A
{
	void show();
}
/*class abc implements A
{
	public void show()
	{
		System.out.println("welcome to lambda");
	}
}*/

public class lambda1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*abc ab=new abc();
		ab.show();*/
		A ab=()->
		{
			
				System.out.println("welcome to lambda1");
			
		};
		ab.show();

	}

}
