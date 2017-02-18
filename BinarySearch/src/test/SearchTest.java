package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Search;

public class SearchTest {

	int[] arrayTest = { 3, 7, 20, 32, 45, 55, 60, 75 };

	public void setUp() {
		// TODO Auto-generated method stub

	}

	@Test
	public void testBinarySearch() {
		// Test empty array
		int element = Search.binarySearch(new int[] {}, 1);
		assertEquals("Empty Array", -1, element);
		
		//Test array with only one element
		element = Search.binarySearch(new int[] {5}, 5);
		assertEquals("Empty Array", 0, element);

		// Test element at the beginning
		element = Search.binarySearch(arrayTest, 3);
		assertEquals("Element at the begining", 0, element);
		
		// Test element at the end
		element = Search.binarySearch(arrayTest, 75);
		assertEquals("Element at the begining", 7, element);
		
		// Test non-existing element
		element = Search.binarySearch(arrayTest, 21);
		assertEquals("Element at the begining", -1, element);
	}

}
