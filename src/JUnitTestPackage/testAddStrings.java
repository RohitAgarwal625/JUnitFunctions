package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunctions justr= new JUnitFunctions();
		  String result = justr.AddString("capstone","project");
		assertEquals ("capstoneproject",result);
	}

}
