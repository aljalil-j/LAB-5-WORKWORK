

public class GiftDriver {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		GiftList list = new GiftList (0, null);
		System.out.println("Adding buses");
		for(int i=1;i<6;i++) {
			GiftList gift = null;
			list.addtoBack(gift);
		}
		list.display();
		for(int i=1;i<6;i++) {
			list  = (GiftList) list.deleteFromFront();
			System.out.println("Deleted : ");
			GiftList gift = null;
			gift.display();
		}
		list.display();

	}
}