package collection;


import java.util.NavigableMap;
import java.util.TreeMap;

public class Example5
{

	public static void main(String[] args) 
	{
		NavigableMap<Integer,String>s=new TreeMap<Integer,String>();
		s.put(15, "Shivaji");
		s.put(20, null);
		//s.remove(12);
		System.out.println(s);
		System.out.println(s.lastEntry());


	}

}
