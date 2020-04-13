package question7;

public class Brownie implements BakedGoods {
	private int cost;
	private String desc;
	private String bestBy;
	
	public int getPrice() {
		return cost;
	}
	public String getDescription() {
		return desc;
	}
	public String getSellByDate() {
		return bestBy;
	}
	public void setPrice(int newCost) {
		cost = newCost;
	}
	public void setDescription(String newDesc) {
		desc = newDesc;
	}
	public void setSellByDate(String newBestBy) {
		bestBy = newBestBy;
	}
}