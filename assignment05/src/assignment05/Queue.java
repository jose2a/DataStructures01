package assignment05;

import linkedlist.LinkedList;
import linkedlist.Node;

public class Queue<E> {
	private LinkedList<E> linkedList;

	public Queue() {
		linkedList = new LinkedList<>();
	}

	public boolean isEmpty() {
		return linkedList.length() == 0;
	}

	public boolean enqueue(E item) {
		try {
			return linkedList.insertAtEnd(item);
		} catch (Exception e) {
			return false;
		}
	}

	public E dequeue() {
		if (linkedList.length() == 0) {
			throw new RuntimeException("The queue is empty.");
		}
		
		return linkedList.deleteFromHead();
	}

	public E peek() {
		if (linkedList.length() == 0) {
			throw new RuntimeException("The queue is empty.");
		}
		
		try {
			return linkedList.getHead().getData();
		} catch (Exception e) {
			throw new RuntimeException("The queue is empty.");
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
