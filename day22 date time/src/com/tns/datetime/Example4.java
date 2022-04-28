package com.tns.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dt=LocalDate.now();
		LocalDate dt2=dt.plusDays(4);
		System.out.println(dt2);
		long dt3=ChronoUnit.DAYS.between(dt, dt2);
		System.out.println(dt3);
		

	}

}
