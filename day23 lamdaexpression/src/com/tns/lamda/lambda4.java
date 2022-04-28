package com.tns.lamda;

import java.util.ArrayList;

public class lambda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> s=new ArrayList<>();
		s.add(12);
		s.add(32);
		s.add(42);
		System.out.println(s);
		s.forEach((n)->
		{
			System.out.println(n);
		});

	}

}
