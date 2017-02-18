package assignment05;

import linkedlist.LinkedList;
import linkedlist.Node;

public class Stack<E> {
	
	private LinkedList<E> linkedList;
	
	public Stack() {
		linkedList = new LinkedList<E>();
	}
	
	public boolean isEmpty() {
		return linkedList.length() == 0;
	}
	
	public boolean push(E item) {
		try {
			return linkedList.addAtStart(item);			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public E pop() {
		try {
			return linkedList.deleteFromHead();
		} catch (Exception e) {
			throw new RuntimeException("Empty stack.");
		}
	}
	
	public E peek() {
		try {
			return linkedList.get(0);
		} catch (Exception e) {
			throw new RuntimeException("Empty stack.");
		}
	}
	
	@Override
	public String toString() {
		String result = "{";
		
		Node<E> current = linkedList.getHead();
		
		while (current != null) {
			result += current + ", ";
			
			current = current.getNextNode();
		}
		
		result += "}";
		return result;
	}

}
