package com.tns.api;

import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Integer[] arr=new Integer[] {11,22,33};
		Stream<Integer> ab=Stream.of(11,22,33);
		System.out.println(ab);

	}

}
