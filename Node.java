
public class Node {
public Node() {
		
	}
	public Node(GiftList data, Node next) {
		super();
		this.data = data;
		Next = next;
	}
	GiftList data;
	
	public GiftList getData() {
		return data;
	}
	
	public void setData(GiftList data) {
		this.data = data;
	}
	public Node getNext() {
		return Next;
	}
	public void setNext(Node next) {
		Next = next;
	}
	Node  Next;

	

}
