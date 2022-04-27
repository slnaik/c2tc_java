package com.tns.Junit;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;

public class Example4
{
	@BeforeAll
	static void disp()
	{
		System.out.println("my name is shankar");
	}
	@Disabled
	@Test
	 void disp1()
	{
		System.out.println("my name is ram");
	}

}
