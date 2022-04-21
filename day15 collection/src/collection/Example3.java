package collection;

import java.util.LinkedList;

public class Example3 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList<>();
		obj.add(50);
		obj.add("shankar");
		obj.add(30.0);
		obj.add(40);
		System.out.println(obj);
		obj.addFirst(5);
		obj.addLast(25);
		
		System.out.println(obj);
		System.out.println(obj.size());
		LinkedList obj1=new LinkedList<>();
		obj1.add("ram");
		obj1.add("sham");
		obj1.add("bhim");
		obj.addAll(2,obj1);
		System.out.println(obj);
		

	}
}
