package assignment05.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import assignment05.Stack;

public class StackTest {

	private Stack<Integer> emptyStack;
	private Stack<Integer> stack;

	@Before
	public void setUp() throws Exception {
		emptyStack = new Stack<>();
		stack = new Stack<>();
		stack.push(4);
		stack.push(10);
	}

	@Test
	public void testIsEmpty() {
		System.out.println("\nTesting isEmpty.");

		// The stack should be empty
		assertTrue("Emptystack should be empty.", emptyStack.isEmpty());
		System.out.println(emptyStack);
		
		// This stack should have elements
		assertFalse("Stack shouldn't be empty.", stack.isEmpty());
		System.out.println(stack);		

		// The stack is empty, so it should throw an exception
		try {
			emptyStack.pop();

			fail("The stack is empty.");
		} catch (RuntimeException e) {
			// TODO: handle exception
		}

		// The stack is empty, so it should throw an exception
		try {
			emptyStack.peek();

			fail("The stack is empty.");
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
	}

	@Test
	public void testPush() {
		System.out.println("\nTesting push.");

		assertTrue("Push 4 to emtyStack.", emptyStack.push(4));
		assertTrue("Pop element from emtyStack.", emptyStack.peek().intValue() == 4);
		
		System.out.println(emptyStack);

		assertTrue("Push 24 to stack.", stack.push(24));
		
		System.out.println(stack);
		
		assertEquals("Peek element from stack.", 24, stack.peek().intValue());
		assertEquals("Pop element from stack.", 24, stack.pop().intValue());
		
		System.out.println(stack);
	}

	@Test
	public void testPop() {
		System.out.println("\nTesting pop.");

		// The stack is empty, so it should throw an exception
		try {
			emptyStack.pop();

			fail("The stack is empty.");
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		
		System.out.println(stack);
		
		assertTrue("Pop element from stack.", 10 == stack.pop().intValue());
		assertTrue("Pop element from stack.", 4 == stack.pop().intValue());
		
		System.out.println(stack);
	}

	@Test
	public void testPeek() {
		System.out.println("\nTesting peek.");

		// The stack is empty, so it should throw an exception
		try {
			emptyStack.peek();

			fail("The stack is empty.");
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		
		assertTrue("Push 12 to stack.", stack.push(12));
		
		System.out.println(stack);
		
		assertEquals("Peek element from stack.", 12, stack.peek().intValue());
		assertEquals("Pop element from stack.", 12, stack.pop().intValue());
		assertEquals("Peek element from stack.", 10, stack.peek().intValue());
		
		System.out.println(stack);
	}

}
