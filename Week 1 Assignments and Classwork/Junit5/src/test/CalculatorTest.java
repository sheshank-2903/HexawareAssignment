package test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {
	Calculator cal=new Calculator();

	@Test
	void testAdd() {
		assertEquals(3,cal.add(1,2),()->"The addition is wrong");
	}

	@Test
	void testSub() {
		assertEquals(10,cal.sub(11,1));
		
	}
	
	@Test
	void testMul() {
		assertEquals(20,cal.mul(5,4));
		
		
		
	}
	
	@Test
	void testDiv() {
		assertEquals(2.5,cal.div(5,2));
	}
	
	@Test
	void testObj() {
		Calculator cal1=cal;
		assertSame(cal1, cal);
		
		//Calculator cal1=new Calculator();
		//assertNotSame("The objects are same",cal1, cal);
		
	}

}
