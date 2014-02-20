public class ArrayStack implements Stack{

	static final int INITIAL_CAPACITY = 5;
	private int N;
	Object[] S;
	private int t = -1; //used to track how many items are in the stack
	
	//constructors
	public ArrayStack() {
		this(INITIAL_CAPACITY);
	}
	
	public ArrayStack(int capacity) {
		N = capacity;
		S = new Object[N];
	}
	
	@Override
	public Object top() throws StackEmptyException {
		return S[t];
	}

	@Override
	public int size() {
		return t + 1;
	}

	@Override
	public boolean isEmpty() {
		return t < 0;
	}

	@Override
	public Object pop() throws StackEmptyException {
		if (isEmpty()) throw new StackEmptyException("Stack is empty");
		Object elem = S[t];
		S[t--] = null;
		return elem;
	}

	@Override
	public void push(Object elem) {
		//if the array is full, create a new array with double the size
		//and copy old elements to the new array
		if (size() == N) {
			N *= 2;
			Object[] newStack = new Object[N];
			System.arraycopy(S, 0, newStack, 0, size());
			S = newStack;
		}
		S[++t] = elem;
	}
	
	public int remainingCapacity() {
		return N - size();
	}

}
