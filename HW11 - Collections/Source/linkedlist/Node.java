package linkedlist;

public class Node {
	private String element;
	private Node previous;
	private Node next;
	protected String getElement() {
		return element;
	}
	protected void setElement(String element) {
		this.element = element;
	}
	protected Node getPrevious() {
		return previous;
	}
	protected Node(String element) {
		this.element = element;
	}
	protected void setPrevious(Node previous) {
		this.previous = previous;
	}
	protected Node getNext() {
		return next;
	}
	protected void setNext(Node next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [element=" + element + ", previous=" + previous + ", next=" + next + "]";
	}
}
