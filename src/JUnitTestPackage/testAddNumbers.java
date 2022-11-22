package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
	  JUnitFunctions ju= new JUnitFunctions();
	  int result = ju.AddNumbers(100,200);
	assertEquals (300,result);
	}

}
