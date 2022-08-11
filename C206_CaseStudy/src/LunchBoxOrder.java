
public class LunchBoxOrder { // Committed by Hui
	
	private int ordID ; 
	private String date ; // order Date
    private String menuset;
    private String drink;
    private String fruit;
	
	
	public LunchBoxOrder(int ordID, String menuset,String drink, String fruit, String date) {
		super();
		this.ordID = ordID;
		this.menuset=menuset;
		this.drink=drink;
		this.fruit=fruit;
		this.date = date;
	}


	public int getOrdID() {
		return ordID;
	}


	public String getDate() {
		return date;
	}


	public String getMenuset() {
		return menuset;
	}


	public String getDrink() {
		return drink;
	}


	public String getFruit() {
		return fruit;
	}

	
	
}
