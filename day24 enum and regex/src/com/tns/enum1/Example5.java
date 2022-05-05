package com.tns.enum1;

public class Example5 {
	enum day
	{
		sunday,monday,tuesday,wendsday,thursday,friday,saturday;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		day d=day.sunday;
		disp(d);
	}
		public static void disp(day d)
		{
			if(d==day.monday)
			{
				System.out.println("same");
			}
			else
			{
				System.out.println(" not same");
			}
		}

	}


