
public class LinkedListStack implements Stack{

	private LinkedList linkedList;
	
	public LinkedListStack() {
		linkedList = new LinkedList();
	}
	
	@Override
	public Object top() throws StackEmptyException {
		return linkedList.peek();
		
	}

	@Override
	public int size() {
		return linkedList.getLength();
	}

	@Override
	public boolean isEmpty() {
		return linkedList.getLength() <= 0;
	}

	@Override
	public Object pop() throws StackEmptyException {
		if (isEmpty()) throw new StackEmptyException("Stack is empty");
		return linkedList.removeAtPosition(0);
	}

	@Override
	public void push(Object elem) {
		linkedList.appendAtHead(elem);
	}

}
