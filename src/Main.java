
public class Main {
	
	static String[] strArray = {"Red", "Green", "Blue", "Yellow", "Purple", "Pink"}; 
	
	public static void main(String[] args) {
		ArrayStack arrayStack = new ArrayStack();
		for(String elem : strArray) {
			System.out.println("Pushing " + elem);
			arrayStack.push(elem);
		}
		
		System.out.println("Size: " + arrayStack.size());
		System.out.println("Popping " + arrayStack.pop());
		System.out.println("Popping " + arrayStack.pop());
		System.out.println("Popping " + arrayStack.pop());
		System.out.println("Popping " + arrayStack.pop());
		System.out.println(arrayStack.size());
	}

}
