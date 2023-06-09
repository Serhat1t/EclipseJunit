package packag;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringOperationTest {

	StringOperation operation=new StringOperation();
	
	@Test
	public void testFirstTwoCharacters_StringOne() {
		String s="w";
		String expect="w";
		String actual=operation.firstTwoCharacters(s);
		assertEquals(expect, actual);
	}
	@Test
	public void testFirstTwoCharacters_Normal() {
		assertEquals("ba", operation.firstTwoCharacters("babacan"));
	}

}
