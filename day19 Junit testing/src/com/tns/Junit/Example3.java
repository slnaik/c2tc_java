package com.tns.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Example3 {
	
		 
		@Test
		void disp() {
			int a=1;
			int b=2;
			assertEquals(a,b);
			
		}
		@Disabled
		@Test
		void disp1()
		{
			int a=1;
			int b=1;
			assertEquals(a,b);
		}
			
		

	}



