package assignment05.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import assignment05.Queue;

public class QueueTest {
	
	private Queue<Integer> emptyQueue;
	private Queue<Integer> largeQueue;

	@Before
	public void setUp() throws Exception {
		emptyQueue = new Queue<>();
		largeQueue = new Queue<>();
		
		largeQueue.enqueue(0);
		largeQueue.enqueue(1);
		largeQueue.enqueue(2);
		largeQueue.enqueue(3);
		largeQueue.enqueue(4);
		largeQueue.enqueue(5);
		largeQueue.enqueue(6);
		largeQueue.enqueue(7);
		largeQueue.enqueue(8);
		largeQueue.enqueue(9);
	}

	@Test
	public void testIsEmpty() {
		System.out.println("\nTesting isEmpty.");
		
		assertTrue("emptyQueue is empty.", emptyQueue.isEmpty());
		
		assertTrue("largeQueue is not empty.", !largeQueue.isEmpty());
		
		System.out.println(largeQueue);
	}

	@Test
	public void testEnqueue() {
		System.out.println("\nTesting enqueue.");
		
		assertTrue("Queue into emptyQueue.", emptyQueue.enqueue(3));
		assertTrue("Queue into emptyQueue.", emptyQueue.enqueue(6));
		assertTrue("Queue into emptyQueue.", !emptyQueue.isEmpty());
		
		System.out.println(emptyQueue);
		
		assertTrue("Queue into emptyQueue.", largeQueue.enqueue(10));
		
		System.out.println(largeQueue);
		
		assertTrue("Queue into emptyQueue.", largeQueue.peek().intValue() == 0);
	}

	@Test
	public void testDequeue() {
		try {
			emptyQueue.dequeue();
			fail("Empty queue.");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		assertEquals("Dequeue from largeQueue.", 0, largeQueue.dequeue().intValue());
		assertEquals("Dequeue from largeQueue.", 1, largeQueue.dequeue().intValue());
		assertEquals("Dequeue from largeQueue.", 2, largeQueue.dequeue().intValue());
		assertEquals("Dequeue from largeQueue.", 3, largeQueue.dequeue().intValue());
		
		assertEquals("Dequeue from largeQueue.", 4, largeQueue.peek().intValue());		
	}

	@Test
	public void testPeek() {
		try {
			emptyQueue.peek();
			fail("Empty queue.");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		assertEquals("Dequeue from largeQueue.", 0, largeQueue.peek().intValue());
		assertEquals("Dequeue from largeQueue.", 0, largeQueue.dequeue().intValue());
		assertEquals("Dequeue from largeQueue.", 1, largeQueue.peek().intValue());
	}

}
