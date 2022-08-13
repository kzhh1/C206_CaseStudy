
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21021860, 10 Aug 2022 2:30:17 pm
 */

public class orderbill {

	public orderbill(int serialnumber, String menuset, String drink, String fruit, double price) {
		super();
		this.serialnumber = serialnumber;
		this.menuset = menuset;
		this.drink = drink;
		this.fruit = fruit;
		this.price = price;
	}
	
	public int getSerialnumber() {
		return serialnumber;
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
	public double getPrice() {
		return price;
	}

	private int serialnumber;
    private String menuset;
    private String drink;
    private String fruit;
    private double price;
    	
}
