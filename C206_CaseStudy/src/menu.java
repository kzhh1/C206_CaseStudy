
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21021860, 10 Aug 2022 2:27:10 pm
 */

public class menu{

    private String menuset;
    private String drink;
    private String fruit;
	/**
	 * @param menuset
	 * @param drink
	 * @param fruit
	 */
	public menu(String menuset, String drink, String fruit) {
		super();
		this.menuset = menuset;
		this.drink = drink;
		this.fruit = fruit;
	}
	/**
	 * @return the menuset
	 */
	public String getMenuset() {
		return menuset;
	}
	/**
	 * @return the drink
	 */
	public String getDrink() {
		return drink;
	}
	/**
	 * @return the fruit
	 */
	public String getFruit() {
		return fruit;
	}

}
