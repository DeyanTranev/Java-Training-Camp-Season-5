package linkedlist;

public class MyLinkedList {
	private static Node head=new Node("String0");
	private Node tail=null;
	private int size=1;
	private int current = 1;
	
	
	protected static Node getHead() {
		return head;
	}


	protected static void setHead(Node head) {
		MyLinkedList.head = head;
	}


	protected Node getTail() {
		return tail;
	}


	protected void setTail(Node tail) {
		this.tail = tail;
	}


	protected int getSize() {
		return size;
	}


	protected void setSize(int count) {
		this.size = count;
	}


	protected int getCurrent() {
		return current;
	}


	protected void setCurrent(int current) {
		this.current = current;
	}


	void addNode(String s) {
		Node n = new Node(s);
		n.setPrevious(this.tail);
		this.tail = n;
		this.setSize(this.getSize()+1);
	}
	
	void removeNode() {
		
	}
}
