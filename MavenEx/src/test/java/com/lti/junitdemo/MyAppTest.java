package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;

class MyAppTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testShow()
	{
		MyApp m =new MyApp();
		String s=m.show();
		Assertions.assertEquals("hello maven", s);
	}
	
	@Disabled
	@Test
	void testAdd() {
		int r=Calculator.add(100, 200);
		
		Assertions.assertEquals(300, r);
		Assertions.assertEquals(100,Calculator.add(50,50),"Testing Add Method");
		Assertions.assertNotEquals(100, r);
		
	}
	
	@Test
	void testAssertFalse() {
		Assertions.assertFalse("Preethi".length()==10);
		Assertions.assertFalse(10>20,"comparing two values");
	}
	
	@Test
	void testAssertNull(){
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
		
	}
	
//	@Test
//	void testAssertAll() {
//		String str1="abc";
//		String str2="xyz";
//		String str3="pqr";
//		Assertions.assertAll("data",
//				() -> Assertions.assertEquals(str1,"abc"),
//				() -> Assertions.assertEquals(str2,"xyz"),
//				() -> Assertions.assertEquals(str3,"pqr")
//				);
//	}
	
//	@Test
//	void testCollections() {
//		ArrayList<String> myList=new ArrayList<>();
//		myList.add("Hello");
//		Assertions.assertFalse(myList.isEmpty());
//		ArrayList<Integer> myList1=new ArrayList<>();
//		Assertions.assertEquals(true, myList1.isEmpty());
//		
//	}
//	@Test
//	public void testCompanyName() {
//		Product p = new Product(101,"charger",10000.00,"Dmart");
//		Assertions.assertEquals("Dmart",p.getCompanyName());
//	}
//	@Test
//	public void testExceptions() {		
//		
//	    Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
//	        Integer.parseInt("100assff");
//	        });
//
//	    String expectedMessage = "For input string";
//	    String actualMessage = exception.getMessage();
//	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	   // Assertions.assertEquals(expectedMessage,actualMessage);
	    
//	    @Test
//		 void testAssumeTrue() {
//		      boolean b = "A" == "A";
//		      Assumptions.assumeTrue(b);
//		     // Assertions.assertEquals("Hello", "Hello");
//		 }
//
//		
//		 @Test
//		 void testAssumeFalse() {
//		      boolean b = 'A' != 'A';
//		      Assumptions.assumeFalse(b);
//		      Assertions.assertEquals("Hello", "Hello");
//		 }
}
