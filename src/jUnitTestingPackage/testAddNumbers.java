package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction obj = new jUnitFunction();
		int result = obj.addNumbers(100, 200);
		assertEquals(300,result);
		
	}

}
