package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String datetime="2022-04-27 18:15";
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l= LocalDateTime.parse(datetime,dt);
		System.out.println(l);

	}

}
