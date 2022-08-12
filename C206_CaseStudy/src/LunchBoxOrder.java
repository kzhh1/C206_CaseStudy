
public class LunchBoxOrder { // Committed by Hui
	
	private String ordID ; // based on order no
    private String menuset;
    private String drink;
    private String fruit;
	
	public LunchBoxOrder(String ordID, String menuset, String drink, String fruit) {
		super();
		this.ordID = ordID;
		this.menuset = menuset;
		this.drink = drink;
		this.fruit = fruit;
	}

	public String getOrdID() {
		return ordID;
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
