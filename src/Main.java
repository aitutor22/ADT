
public class Main {
	
	static String[] strArray = {"Red", "Green", "Blue", "Yellow", "Purple", "Pink"}; 
	
	public static void main(String[] args) {
//		ArrayStack arrayStack = new ArrayStack();
//		for(String elem : strArray) {
//			System.out.println("Pushing " + elem);
//			arrayStack.push(elem);
//		}
//		
//		System.out.println("Size: " + arrayStack.size());
//		System.out.println("Popping " + arrayStack.pop());
//		System.out.println("Popping " + arrayStack.pop());
//		System.out.println("Popping " + arrayStack.pop());
//		System.out.println("Popping " + arrayStack.pop());
//		System.out.println(arrayStack.size());
//	}

//		LinkedList linkedList = new LinkedList();
//		for(String elem : strArray) {
//			linkedList.append(elem);
//			System.out.println("Pushing " + elem);
//		}
//		linkedList.printListContents();
//		linkedList.remove("Red");
//		linkedList.remove("Purple");
//		linkedList.remove("Pink");
//		linkedList.printListContents();
//		linkedList.appendAtHead("Black");
//		linkedList.printListContents();
//		linkedList.append("Black");
		
//		linkedList.printListContents();
//		linkedList.removeAtPosition(4);
//		linkedList.printListContents();
		
		LinkedListStack linkedListStack = new LinkedListStack();
		for(String elem : strArray) {
			linkedListStack.push(elem);
			System.out.println("Pushing " + elem);
		}
		
		System.out.println("Size: " + linkedListStack.size());
		System.out.println("Popping " + linkedListStack.pop());
		System.out.println("Popping " + linkedListStack.pop());
		System.out.println("Popping " + linkedListStack.pop());
		System.out.println("Popping " + linkedListStack.pop());
		System.out.println(linkedListStack.size());		
	}

}
