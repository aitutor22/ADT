public class ListNode {
	private Object data;
	private ListNode next;
	
	public ListNode(Object data) {
		this(data, null);
	}
	
	public ListNode(Object data, ListNode next) {
		setData(data);
		setNext(next);
	}
	
	public Object getData() {
		return data;
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public void setNext(ListNode node) {
		this.next = node;
	}
}
