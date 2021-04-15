package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnitString = new jUnitFunction();
		String result = jUnitString.addString("capstone ", "Project");
		assertEquals("capstone Project",result);
	}

}
