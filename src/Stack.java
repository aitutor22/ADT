public interface Stack {

	//accessor methods
	public Object top() throws StackEmptyException;
	public int size();
	public boolean isEmpty();
	
	//update methods
	public Object pop() throws StackEmptyException;
	public void push(Object elem);
}
