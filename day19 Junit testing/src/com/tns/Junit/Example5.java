package com.tns.Junit;

import org.junit.jupiter.api.Assumptions;

public class Example5 
{
	void accept()
	{
		System.setProperty("1","shankar");
		Assumptions.assumeTrue("shankar".equals(System.getProperty("2")));
		
	}

}
