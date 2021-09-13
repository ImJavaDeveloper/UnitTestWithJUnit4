package com.basic.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	StringHelper helper=new StringHelper();
	
	private String input;
	private String expected;
	
	
	public ParameterizedTest(String input, String expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	@Parameters
	public static Collection<String[]> testConditions()
	{
		String expectedValues [][]= {{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedValues);
	}
	@Test
	public void testTruncateAInFirstTwoPosition() {

		assertEquals(expected, helper.truncateAInFirstTwoPosition(input));
	}
	
}