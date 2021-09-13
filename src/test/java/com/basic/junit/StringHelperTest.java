package com.basic.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper=new StringHelper();
	
	@BeforeClass
	public static void beforeAllTest()
	{
		System.out.println("Before All Test");
	}
	
	@AfterClass
	public static void afterAllTest()
	{
		System.out.println("After All Test");
	}
	
	@Before // This annotaion became @BeforeEach in Junit5
	public void forEachTestInitialization()
	{
		System.out.println("Intialization Test");
	}
	
	@After //This annotaion became @AfterEach in Junit5
	public void forAfterEachTest()
	{
		System.out.println("Clean Process Initiated");
	}
	
	@Test
	public void test() {
		assertEquals("ABC", "ABC");
	}
	
	@Test
	public void testTruncateAInFirstTwoPosition() {
		assertEquals("ABC", "ABC");
		
		String expected="CD";
		assertEquals(expected, helper.truncateAInFirstTwoPosition("AACD"));
	}
	
	
	
	@Test
	public void  testIsFirstAndLastTwoCharSame()
	{
		assertTrue(helper.isFirstAndLastTwoCharSame("AB"));
		
	}
	
	@Test
	public void testSortedArray() {
	int [] num= {2,1,4,3,5};
	int expected [] = {1,2,3,4,5};
	Arrays.sort(num);
	assertArrayEquals(expected, num);
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullException()
	{
		String val=null;
		String val2=val.toLowerCase();
		
	}
	
    @Test(timeout=10)
    public void testSort_Performance()
    {
    int [] array=new int[100000];
    
    {
    	for(int i=0;i<100000;i++)
    	{
    		array[i]=i;
    		
    		
    }
    	Arrays.sort(array);
    	
    }
    }
}
