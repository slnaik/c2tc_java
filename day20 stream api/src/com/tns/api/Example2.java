package com.tns.api;

import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>values=Arrays.asList(11,22,33,22,60,25,11);
		values.stream().filter(i->i<10).forEach(i->System.out.println(i));
		values.stream().distinct().forEach(i->System.out.println("unique values are"+i));
		

	}

}
