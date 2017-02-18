package doublylinkedlist.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import doublylinkedlist.DoublyLinkedList;

public class DoubleLinkedListTest {

	private DoublyLinkedList doubleLinkedList;
	
	@Before
	public void setUp() throws Exception {
		doubleLinkedList = new DoublyLinkedList();
		doubleLinkedList.insertAtHead(4);
		doubleLinkedList.insertAtHead(10);
	}

	@Test
	public void testInsertAtHead() {
		System.out.println("\nTesting InsertAtHead.");
		
		assertTrue("Testing inserting at head.", doubleLinkedList.insertAtHead(2));
		assertEquals("Getting element at the head (0).", 2, doubleLinkedList.get(0));
		assertEquals("Getting length.", 3, doubleLinkedList.length());
		
		System.out.println(doubleLinkedList.toString());
	}
	
	@Test
	public void testGet() {
		System.out.println("\nTesting Get.");
		
		try {
			doubleLinkedList.get(-1);
			
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		try {
			doubleLinkedList.get(2);
			
			fail("Check out of bounds");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		assertEquals("Getting element at the head (0).", 10, doubleLinkedList.get(0));
		
		doubleLinkedList.reverse();
	}

}
