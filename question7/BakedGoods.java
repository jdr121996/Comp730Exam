package question7;

public interface BakedGoods {
	public int getPrice();
	public String getDescription();
	public String getSellByDate();
	
	public void setPrice(int cost);
	public void setDescription(String desc);
	public void setSellByDate(String bestBy);
}