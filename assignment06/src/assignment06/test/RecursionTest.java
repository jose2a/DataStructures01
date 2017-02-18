package assignment06.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import assignment06.Recursion;

public class RecursionTest {
	
	private Recursion recursion;

	@Before
	public void setUp() throws Exception {
		recursion = new Recursion();
	}

	@Test
	public void testSum() {
		System.out.println("\nTest sum.");
		assertEquals("Sum", 8, recursion.sum(5, 3));
		assertEquals("Sum", 20, recursion.sum(15, 5));
	}

	@Test
	public void testSquareSum() {
		System.out.println("\nTest squareSum.");

		assertTrue("Sum", recursion.squareSum(3) == 14);
		assertTrue("Sum", recursion.squareSum(5) == 55);
	}

}
