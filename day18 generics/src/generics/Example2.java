package generics;
//generic class//

public class Example2<T>
{
	T val;
	
	public void print()
	{
		System.out.println(val.getClass().getName());
	}
	
	public static void main(String[] args) 
	{
		//For Integer
		Example2<Integer>obj=new Example2<Integer>();
		obj.val=15;
		obj.print();
		
		//For String
		Example2<String>obj1=new Example2<String>();
		obj1.val="Shankar";
		obj1.print();
		
		//For Character
		Example2<Character>obj2=new Example2<Character>();
		obj2.val='Z';
		obj2.print();



	}

}
