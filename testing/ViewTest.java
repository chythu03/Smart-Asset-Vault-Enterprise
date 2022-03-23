package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ViewTest {

	@Test
	void testViewStatus() {
		//fail("Not yet implemented");
		View obj=new View();
		//String s=obj.ViewStatus("A10003");
		//assertEquals("working", s);
		
		String s=obj.ViewStatus("A1001");
		assertEquals("", s);
	}

	/*@Test
	void testViewLocation() {
		//fail("Not yet implemented");
		View obj=new View();
		String s=obj.ViewLocation("A10003");
		assertEquals("A1 rec", s);
	}*/


}
