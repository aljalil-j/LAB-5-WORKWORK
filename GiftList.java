
public class GiftList {
	private Node head;
	 
	 
	  

	public GiftList(int i, String string) {
		super();
		this.head = null;
	}
	
	 boolean empty() {
		if (head==null)return true;
		return false;
	}
	 @SuppressWarnings("unused")
	boolean isfull() {
		 Node temp = new Node();
			if (temp==null)return true;
			return false;
		}
	 
	 
	 public boolean addtoBack(GiftList outfit) {
		 if (isfull()) {
			 
			System.out.println("List is full"); 
			 
		 }
		 
		 else {
			 
			 Node NextItem = new Node();
			 NextItem.setData(outfit);
			 head = NextItem;
		 }
		 
		  {
			 Node temp =head;
			 while (temp.getNext () !=null);{
				    temp = temp.getNext();
				    temp.getData().display();
				    temp =temp.getNext();
				    
			 }
			 
		 }
		
		 return false;
	 }

	public void display() {
		// TODO Auto-generated method stub
		
	}

	public Object deleteFromFront() {
		// TODO Auto-generated method stub
		return null;
	} 
	 
}
