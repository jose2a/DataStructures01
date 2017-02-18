package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import linkedlist.LinkedList;

public class LinkedListTest {

	private LinkedList<Integer> linkList;

	@Before
	public void setUp() {
		linkList = new LinkedList<Integer>();
		linkList.insertAtEnd(2);
	}

	@Test
	public void testInsertAtHead() {
		System.out.println("\nTesting inserAtHead.");

		assertTrue("Insert at head.", linkList.insertAtHead(10));
		assertEquals("Verifying size.", 2, linkList.length());
		assertEquals("Getting element at the head (index 0).", new Integer(10), linkList.get(0));

		System.out.println(linkList);

	}

	@Test
	public void testInsertAtEnd() {
		System.out.println("\nTesting inserAtEnd.");

		assertTrue("Adding to the end.", linkList.insertAtEnd(20));
		assertEquals("Verifying size.", 2, linkList.length());
		assertTrue("Getting element at the index 1.", linkList.get(1) == 20);

		System.out.println(linkList);
	}

	@Test
	public void testdeleteFromHead() {
		System.out.println("\nTesting deleteFromHead.");

		assertTrue("Adding to the end.", linkList.insertAtEnd(4));
		assertTrue("Adding to the end.", linkList.insertAtEnd(9));

		System.out.println(linkList);

		assertEquals("Verifying size.", 3, linkList.length());
		assertTrue("Getting element at the index 0.", linkList.get(0) == 2);
		assertTrue("Deleting from  the head.", linkList.deleteFromHead() == 2);

		System.out.println(linkList);
	}

	@Test
	public void testFind() {
		System.out.println("\nTesting find.");

		assertTrue("Adding to the end.", linkList.insertAtEnd(4));
		assertTrue("Adding to the end.", linkList.insertAtEnd(9));
		assertTrue("Finding 4.", linkList.find(4).getData() == 4);
		assertNotNull("Finding 4.", linkList.find(4));

		System.out.println(linkList);
	}

	@Test
	public void testReverse() {
		System.out.println("\nTesting reverse.");

		assertTrue("Adding to the end.", linkList.insertAtEnd(4));
		assertTrue("Adding to the end.", linkList.insertAtEnd(9));
		
		System.out.println(linkList);

		linkList.reverse();
		
		assertTrue("Testing new head.", linkList.get(0) == 9);

		System.out.println(linkList);
	}

}
