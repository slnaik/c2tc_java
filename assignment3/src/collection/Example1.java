package collection;

import java.util.PriorityQueue;
import java.util.Queue;


public class Example1
{

	public static void main(String[] args)
	{
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(20);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());


	}

}
