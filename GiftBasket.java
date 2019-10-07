
public class GiftBasket {

	 int id;
	 public GiftBasket() {
		super();
	}
	public GiftBasket(int id, float cost, String type) {
		super();
		this.id = id;
		this.cost = cost;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	float cost;
	 String type;
}
