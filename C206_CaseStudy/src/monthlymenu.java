
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21021860, 10 Aug 2022 2:29:32 pm
 */

public class monthlymenu{

    private String menuset;
    private String drink;
    private String fruit;
    private String month;
	
	public monthlymenu(String month,String menuset, String drink, String fruit) {
		this.month = month;
		this.menuset = menuset;
		this.drink = drink;
		this.fruit = fruit;
	}
	
	public String getMonth() {
		return month;
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

