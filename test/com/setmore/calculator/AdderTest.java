package com.setmore.calculator;
import junit.framework.TestCase;

import com.setmore.calculator.Adder;

public class AdderTest extends TestCase {
	
	
	public void testOne() {

		Adder adder = new Adder();
		int result = adder.addOne(5);

		assertEquals(result, 6);
	}
	
	
}
