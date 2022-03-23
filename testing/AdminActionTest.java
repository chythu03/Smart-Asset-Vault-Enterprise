package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdminActionTest {
	
	
	
	/*@Test
	void testCreate() {
		//fail("Not yet implemented");
		AdminAction obj=new AdminAction(00001,"Mona","Admin");
		//String s=obj.create("laptop", "electronic");
		//assertEquals("P104", s);
		
		String s=obj.create("laptop", "electronic");
		assertEquals("Product already Exist", s);
		
	}*/

	/*@Test
	void testAddasset() {
		AdminAction obj=new AdminAction(00001,"Mona","Admin");
		String s=obj.addasset("laptop");
		assertEquals("A10011 Asset added", s);
	}*/

	/*@Test
	void testAdd() {
		AdminAction obj=new AdminAction(00001,"Mona","Admin");
		String s=obj.add("laptop", 2);
		assertEquals("A10012 to A10013 Assets added", s);
	}*/

	@Test
	void testUpdateStatus() {
		AdminAction obj=new AdminAction(00001,"Mona","Admin");
		String s=obj.updateStatus("A10001", "damaged");
		assertEquals("Updated", s);
	}

	/*@Test
	void testUpdateLocation() {
		AdminAction obj=new AdminAction(00001,"Mona","Admin");
		String s=obj.updateLocation("A10001", "U1", "1301");
		assertEquals("Updated", s);
	}*/

}
