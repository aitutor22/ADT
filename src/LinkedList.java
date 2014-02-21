public class LinkedList {
	private ListNode head;
	private ListNode current;
	private int length;
	
	public LinkedList() {
		length = 0;
	}
	
	public boolean isEmpty() {
		return length <= 0;
	}
	
	public void append(Object data) {
		//creates a new node
		ListNode elem = new ListNode(data);
		
		//if linked list is currently empty, set head to the created node
		if (isEmpty()) {
			head = elem;
		} else {
			current = head;
			//moves to the last node
			while (current.getNext() != null) {
				current = current.getNext();
			}			
			
			//appends the newly created node to the last current element 
			current.setNext(elem);
		}
		length++;
	}
	
	public void appendAtHead(Object data) {
		//creates a new node and makes it the new head
		ListNode elem = new ListNode(data, head);
		head = elem;
		length++;
	}
	
	public Object peek() {
		return head.getData();
	}
	
	public Object removeAtPosition(int pos) throws ItemNotFoundException{
		ListNode prev;
		if (pos > length - 1) throw new ItemNotFoundException("Out of bounds");
		
		//special case if removing the head
		if (pos == 0) {
			current = head;
			head = head.getNext();
		} else {
			current = head;
			for(int i = 0; i < pos - 1; i++) {
				current = current.getNext();
			}
			prev = current;
			current = current.getNext();
			prev.setNext(current.getNext());			
		}
		length--;
		return current.getData();
	}
	
	//removes the first occurence of data, otherwise throws exception
	public void remove(Object data) throws ItemNotFoundException, EmptyListException {
		if (isEmpty()) throw new EmptyListException("List is empty; item not found");
		
		//special case when the head is to be removed
		if (head.getData().equals(data)) {
			//sets the head to point to the next of the current head
			head = head.getNext();
		} else {
			current = head;
			ListNode prev;
			while (current.getNext() != null && !current.getNext().getData().equals(data)) {
				current = current.getNext();
			}
			//if we reach the end of the list without finding the item, throw an exception
			if (current.getNext() == null) {
				throw new ItemNotFoundException("Item not found");
			} else {
				prev = current;
				current = current.getNext().getNext();
				prev.setNext(current);
			}
				
						
		}
	}
	
	public void printListContents() throws EmptyListException {
		if (isEmpty()) throw new EmptyListException("Empty List");
		
		System.out.println("************");
		System.out.println("List has " + length + " elements");
		current = head;
		//cycles through the linked list and prints the data of each element (except for last element)
		while (current.getNext() != null) {
			System.out.println("Printing data: " + current.getData().toString());
			current = current.getNext();
		}
		
		//prints out last element
		System.out.println("Printing data: " + current.getData().toString());
	}
	
	public int getLength() {
		return length;
	}
}

