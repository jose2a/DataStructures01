package doublylinkedlist;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	public DoublyLinkedList() {
		length = 0;
	}
	
	public boolean insertAtHead(int data) {
		try {
			Node newNode = new Node(data);
			/*newNode.setNextNode(head);
			
			if (head != null) {
				head.setPreviousNode(newNode);
			}
			
			this.head = newNode;*/
			
			if(head == null) {				
				head = newNode;
				tail = newNode;
			} else {
				head.setPreviousNode(newNode);
				newNode.setNextNode(head);
				head = newNode;				
			}
			
			length++;
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public int get(int position) {
		if (position < 0 || position >= length) {
			throw new IndexOutOfBoundsException();
		}
		
		Node current = head;
		
		int counter = 0;
		
		while(counter < position) {
			current = current.getNextNode();
			
			counter++;
		}
		
		return current.getData();
	}
	
	public void reverse() {
		Node current = tail;
		
		while(current != null) {
			System.out.println(current);
			current = current.getPreviousNode();
		}
	}
	
	public int length() {
		return length;
	}
	
	@Override
	public String toString() {
		String result = "{";
		
		Node current = head;
		
		while(current != null) {
			result += current.toString() + ", ";
			
			current = current.getNextNode();
		}
		
		result = result.substring(0, result.length() - 1);
		
		result += "}";
		
		return result;
	}

}
