package binarytree.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import binarytree.BinarySearchTree;

public class BinaryTreeTest {
	
	private BinarySearchTree<Integer> bt;

	@Before
	public void setUp() throws Exception {
		bt = new BinarySearchTree<>();
	}

	@Test
	public void testInsert() {
		System.out.println("\nTesting insert.");
		
		assertTrue("Insert 12.", bt.insert(12));
		assertTrue("Insert 5.", bt.insert(5));
		assertTrue("Insert 16.", bt.insert(16));
		assertTrue("Insert 8.", bt.insert(8));
		assertTrue("Insert 6.", bt.insert(6));
	}

	@Test
	public void testFind() {
		System.out.println("Testing find.");
		
		assertTrue("Insert 12.", bt.insert(12));
		assertTrue("Insert 5.", bt.insert(5));
		assertTrue("Insert 16.", bt.insert(16));
		assertTrue("Insert 8.", bt.insert(8));
		assertTrue("Insert 6.", bt.insert(6));
		
		assertEquals("Find 8.", 8, bt.find(8).getData().intValue());
		assertEquals("Find 1.", null, bt.find(1));
	}

	@Test
	public void testDelete() {
		System.out.println("\nTesting delete.");
		
		assertTrue("Insert 12.", bt.insert(12));
		assertTrue("Insert 8.", bt.insert(8));
		assertTrue("Insert 16.", bt.insert(16));
		assertTrue("Insert 10.", bt.insert(10));
		assertTrue("Insert 4.", bt.insert(4));
		assertTrue("Insert 20.", bt.insert(20));
		assertTrue("Insert 9.", bt.insert(9));
		assertTrue("Insert 2.", bt.insert(2));
		assertTrue("Insert 5.", bt.insert(5));
		assertTrue("Insert 1.", bt.insert(1));
		
		assertTrue("Delete 1.", bt.delete(1));
		assertTrue("Delete 10.", bt.delete(10));
		assertTrue("Delete 8.", bt.delete(8));
		
		assertEquals("Find 1.", null, bt.find(1));
		assertEquals("Find 10.", null, bt.find(10));
		assertEquals("Find 8.", null, bt.find(8));
	}
	
	@Test
	public void testsmallest() {
		System.out.println("\nTesting smallest.");
		
		assertTrue("Insert 12.", bt.insert(12));
		assertTrue("Insert 8.", bt.insert(8));
		assertTrue("Insert 16.", bt.insert(16));
		assertTrue("Insert 10.", bt.insert(10));
		assertTrue("Insert 4.", bt.insert(4));
		
		assertEquals("Smallest 4.", 4, bt.smallest().intValue());
		
		assertTrue("Insert 20.", bt.insert(20));
		assertTrue("Insert 9.", bt.insert(9));
		assertTrue("Insert 2.", bt.insert(2));
		assertTrue("Insert 5.", bt.insert(5));
		assertTrue("Insert 1.", bt.insert(1));
		
		assertEquals("Smallest 1.", 1, bt.smallest().intValue());
	}
	
	@Test
	public void testLargest() {
		System.out.println("\nTesting largest.");
		
		assertTrue("Insert 12.", bt.insert(12));
		assertTrue("Insert 8.", bt.insert(8));
		assertTrue("Insert 16.", bt.insert(16));
		assertTrue("Insert 10.", bt.insert(10));
		assertTrue("Insert 4.", bt.insert(4));
		
		assertEquals("Largest 16.", 16, bt.largest().intValue());
		
		assertTrue("Insert 20.", bt.insert(20));
		assertTrue("Insert 9.", bt.insert(9));
		assertTrue("Insert 2.", bt.insert(2));
		assertTrue("Insert 5.", bt.insert(5));
		assertTrue("Insert 1.", bt.insert(1));
		
		assertEquals("Largest 20.", 20, bt.largest().intValue());
	}
	
	@Test
	public void testLeafNodes() {
		System.out.println("\nTesting leafNodes.");
		
		assertTrue("Insert 12.", bt.insert(12));
		assertTrue("Insert 8.", bt.insert(8));
		assertTrue("Insert 16.", bt.insert(16));
		assertTrue("Insert 10.", bt.insert(10));
		assertTrue("Insert 4.", bt.insert(4));		
		assertTrue("Insert 20.", bt.insert(20));
		assertTrue("Insert 9.", bt.insert(9));
		assertTrue("Insert 2.", bt.insert(2));
		assertTrue("Insert 5.", bt.insert(5));
		assertTrue("Insert 1.", bt.insert(1));
		
		assertEquals("Leaf nodes: 4.", 4, bt.leafNodes());
	}

}
