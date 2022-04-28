package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example3 {

	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();
		
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	    String var=datetime.format(dt);
		System.out.println(var);

	}

}
