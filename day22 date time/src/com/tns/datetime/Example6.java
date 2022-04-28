package com.tns.datetime;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
		LocalTime d=LocalTime.now(ZoneId.of("Egypt"));
				LocalDateTime dt=LocalDateTime.now(ZoneId.of("Egypt"));
						System.out.println(d);
						System.out.println(dt);

	}

}
