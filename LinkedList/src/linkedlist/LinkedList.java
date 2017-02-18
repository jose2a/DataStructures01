package linkedlist;

public class LinkedList<E> {

	private Node<E> head;
	private int length;

	public LinkedList() {
		length = 0;
	}
	
	public Node<E> getHead() {
		return head;
	}

	public void setHead(Node<E> head) {
		this.head = head;		
	}

	public boolean insertAtHead(E data) {
		try {
			if (head == null) {
				head = new Node<E>(data);
			} else {

				Node<E> newNode = new Node<E>(data);
				newNode.setNextNode(head);
				head = newNode;
			}
			length++;

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean addAtStart(E data) {
		return this.insertAtHead(data);
	}

	public boolean insertAtEnd(E data) {
		try {
			if (head == null) {
				head = new Node<E>(data);

			} else {

				Node<E> current = this.head;

				while (current.getNextNode() != null) {
					current = current.getNextNode();
				}

				current.setNextNode(new Node<E>(data));
			}
			length++;

			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public E deleteFromHead() {
		if(head == null) {
			throw new IllegalStateException("The list is empty.");
		}
		
		E data = head.getData();
		
		head = head.getNextNode();
		
		return data;
	}
	
	public Node<E> find(E data) {
		Node<E> current = head;
		
		while (current != null) {
			if (current.getData().equals(data)) {
				return current;
			}
			
			current = current.getNextNode();
		}
		
		return null;
	}
	
	public Node<E> findFromEnd(E data) {
		Node<E> current = head;
		
		while (current != null) {
			if (current.getData() == data) {
				return current;
			}
			
			current = current.getNextNode();
		}
		
		return null;
	}

	public E get(int position) {
		if (position < 0 || position > length) {
			throw new IndexOutOfBoundsException("The position is invalid. It should be between 0 and " + length + ".");
		}

		if (head == null) {
			throw new IllegalStateException("The list is empty.");
		}

		int counter = 0;

		Node<E> current = head;

		while (counter < position) {
			current = current.getNextNode();
			counter++;
		}

		return current.getData();
	}

	public int length() {
		return this.length;
	}
	
	public void reverse() {
		Node<E> current = head;
		Node<E> previous = null;
		Node<E> next = null;
		
		while(current != null) {			
			next = current.getNextNode();			
			current.setNextNode(previous);
			
			previous = current;
			current = next;			
		}
		this.head = previous;
	}

	@Override
	public String toString() {
		String result = "{";

		Node<E> current = this.head;

		while (current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}

		result += "}";
		return result;
	}

}
