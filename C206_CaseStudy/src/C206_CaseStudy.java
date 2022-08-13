import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		
		ArrayList<User> UserList = new ArrayList<User>();
		ArrayList<menuSet> menuSetList = new ArrayList<menuSet>(); 
		ArrayList<drinks> drinkList = new ArrayList<drinks>(); 
		ArrayList<fruits> fruitList = new ArrayList<fruits>(); 
		ArrayList<LunchBoxOrder> lbOrderList = new ArrayList<LunchBoxOrder>(); 
		ArrayList<orderbill> orderBills = new ArrayList<orderbill>();
		ArrayList<monthlymenu> monthlyList = new ArrayList<monthlymenu>();

	// Menu :
		menuSetList.add(new menuSet("Chicken Chop"));
		menuSetList.add(new menuSet("Chicken Curry"));
		menuSetList.add(new menuSet("Vegetarian beehoon"));
		drinkList.add(new drinks("Bandung"));
		drinkList.add(new drinks("Water"));
		drinkList.add(new drinks("Teh"));
		fruitList.add(new fruits("Watermelon"));
		fruitList.add(new fruits("Mango"));
		fruitList.add(new fruits("Strawberry"));

		
	// LunchBoxOrder : 
		lbOrderList.add(new LunchBoxOrder("lb001", "Chicken Chop", "Bandung", "Mango"));
		lbOrderList.add(new LunchBoxOrder("lb002", "chicken Curry", "Teh", "Watermelon"));

		int option = 0;

		while (option != 5) {

			C206_CaseStudy.mainMenu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				C206_CaseStudy.menu();
				int menuOpt = Helper.readInt("Enter sub option > ") ;
				
		// Chin Wei Code :
				
				if (menuOpt == 1) { 
					// View - 
					
				} else if (menuOpt == 2 ) { 
					// Add - 
					
				} else if (menuOpt == 3 ) { 
					// Delete -
					
				} else if (menuOpt == 4) {
					System.out.println("Bye!");
				} else {
					System.out.println("Invalid option");
				}	
					
					
				
			} else if (option == 2) {
				C206_CaseStudy.menu();
				int menuOpt = Helper.readInt("Enter sub option > ") ;
				
		// Desmond AND Zhen hong's Code :
				
				if (menuOpt == 1) {
					// View all items :
					C206_CaseStudy.viewMenuSet(menuSetList);
					C206_CaseStudy.viewDrinks(drinkList);
					C206_CaseStudy.viewFruits(fruitList);
				} else if (menuOpt == 2) { 
					// Add - 
//					possible way
//					foodMenu();
//					int foodOpt = Helper.readInt("Enter option to select food option > ");
//					drinkMenu();
//					int drinkOpt = Helper.readInt("Enter option to select drink option  > ");
//					fruitMenu();
//					int fruitOpt = Helper.readInt("Enter option to select fruit option  > ");
				} else if (menuOpt == 3 ) { 
					// Delete -
					
				} else if (menuOpt == 4) {
					System.out.println("Bye!");
				} else {
					System.out.println("Invalid option");
				}	
				
				
				
			} else if (option == 3) {
				C206_CaseStudy.menu();
				int menuOpt = Helper.readInt("Enter sub option > ") ;
				
		// Hui Hui Code :
				
				if (menuOpt == 1) { 
					// View all LunchBoxOrder :
					C206_CaseStudy.viewLunchBoxOrder(lbOrderList);
					
				} else if (menuOpt == 2 ) { 
					// Add/place lunch box order : 
					LunchBoxOrder lbOrd = inputLunchBoxOrder(lbOrderList, menuSetList);
					C206_CaseStudy.addLunchBoxOrder(lbOrderList, lbOrd);
					System.out.println("Lunch Box Order has been placed");
					
				} else if (menuOpt == 3 ) { 
					// Delete - 
					
					
				} else if (menuOpt == 4) {
					System.out.println("Bye!");
				} else {
					System.out.println("Invalid option");
				}
				
				// String orderId = Helper.readString("Enter order ID > ");
				// ^ uncomment if we doing a if else , if (orderID.contains(
					

				
				
			} else if (option == 4) {
				C206_CaseStudy.orderBillMenu();
				int menuOpt = Helper.readInt("Enter sub option > ") ;
				
		// Shi Hao Code : 
				
				if (menuOpt == 1) { 
					// Add - 
					int serialnumber = orderBills.size() + 1;
					String foodname = Helper.readString("Enter Food Item Name > ") ;
					String drinkname = Helper.readString("Enter Drink Item Name > ") ;
					String fruitname = Helper.readString("Enter Fruit Item Name > ") ;
				    double price = Helper.readDouble("Enter Total Price of items > ");
				    //orderbill.addorderbill
				    orderBills.add(new orderbill(serialnumber, foodname, drinkname, fruitname, price));
					System.out.println("Your order bill has been added.");
					
				} else if (menuOpt == 2 ) { 
					// View - 
					
					int i = Helper.readInt("Enter serial number of entry to view > ");
					
					while (i > orderBills.size()) {
						System.out.println("Please enter a valid serial number!");
						i = Helper.readInt("Enter serial number of entry to view > ");
					}
					
					
					orderbill orderbill = orderBills.get(i - 1);
					System.out.println("Serial Number: " + orderbill.getSerialnumber());
					System.out.println("Your Order: ");
					System.out.println("Food of Choice: " + orderbill.getMenuset());
					System.out.println("Drink of Choice: " + orderbill.getDrink());
					System.out.println("Fruit of Choice: " + orderbill.getFruit());
					System.out.println("Total Cost: $" + orderbill.getPrice());

					
				} else if (menuOpt == 3 ) { 
					// Delete -
					int i = Helper.readInt("Enter serial number of entry to delete > ");
					while (i > orderBills.size()) {
						System.out.println("Please enter a valid serial number!");
						i = Helper.readInt("Enter serial number of entry to delete > ");
					}
					orderBills.remove(i - 1);
					System.out.println("Entry has been deleted.");
					
				} else if (menuOpt == 4) {
					System.out.println("Bye!");
				} else {
					System.out.println("Invalid option");
				}
				
				
				
				
			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid Option Entered!");
			}
			
		}// end of while loop 

	}

	
	public static void mainMenu() {
		C206_CaseStudy.setHeader("LUNCHBOX MANAGEMENT SYSTEM");
		System.out.println("1. Maintain User Accounts");
		System.out.println("2. Maintain Menu/Monthly Item Details");
		System.out.println("3. Maintain Lunch Box Order Details");
		System.out.println("4. Maintain Order Bill Details");
		System.out.println("5. Quit");
		Helper.line(50, "-");
	}

	public static void menu() {
		C206_CaseStudy.setHeader("MENU OPTIONS");
		System.out.println("1. Display menu");
		System.out.println("2. Add MenuSet");
		System.out.println("3. Delete ");
		System.out.println("4. Quit");
	}
	
	// for sh
	
	public static void orderBillMenu() {
		C206_CaseStudy.setHeader("MENU OPTIONS");
		System.out.println("1. Add Order Bill");
		System.out.println("2. View Existing Order Bill");
		System.out.println("3. Delete Existing Order Bill");
		System.out.println("4. Quit");
	}

// For Menu and monthly Menu :
	public static void foodMenu() {
		C206_CaseStudy.setHeader("Food Menu");
		System.out.println("1. Chicken Chop");
		System.out.println("2. Chicken Curry");
		System.out.println("3. Vegeterian BeeHoon");
		Helper.line(80, "-");
	}
	public static void drinkMenu() {
		C206_CaseStudy.setHeader("Drinks Menu");
		System.out.println("1. Bandung");
		System.out.println("2. Water");
		System.out.println("3. Teh");
		Helper.line(80, "-");
	}
	public static void fruitMenu() {
		C206_CaseStudy.setHeader("Fruits Menu");
		System.out.println("1. Watermelon");
		System.out.println("2. Strawberry");
		System.out.println("3. Mango");
		Helper.line(80, "-");
	}
	
	
// For LunchBoxOrder : 
	public static void setMenu() {
		C206_CaseStudy.setHeader("Set Menu");
		System.out.println("--> Western");
		System.out.println("--> Asian");
		System.out.println("--> Vegetarian");
	}

	public static void setHeader(String header) {
		Helper.line(30, "-");
		System.out.println(header);
		Helper.line(30, "-");
	}
	
	
// NOT IN USE YET
	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}

	// ================================= Option 1 View (CRUD - Read)================================= 
	
// Chin wei ,VIEW User account -
	

// Desmond & Zhen Hong , VIEW MenuItems/Monthly Menu :
	public static String retrieveMenuSet(ArrayList<menuSet> menuSetList) {
		String output = "";

		for (int i = 0; i < menuSetList.size(); i++) {

			output += String.format("%-10s\n", menuSetList.get(i).getMenuItem());
		}
		return output;
	}
	public static void viewMenuSet(ArrayList<menuSet> MenuSetList) {
		C206_CaseStudy.setHeader("MENUSET ITEMS");
		String output = retrieveMenuSet(MenuSetList);
		System.out.println(output);
	}
	

	public static String retrieveDrinks(ArrayList<drinks> drinkList) {
		String output = "";

		for (int i = 0; i < drinkList.size(); i++) {

			output += String.format("%-10s\n", drinkList.get(i).getDrink());
		}
		return output;
	}
	public static void viewDrinks(ArrayList<drinks> drinkList) {
		C206_CaseStudy.setHeader("DRINK ITEMS");
		String output = retrieveDrinks(drinkList);
		System.out.println(output);

	}

	
	public static String retrieveFruits(ArrayList<fruits> fruitList) {
		String output = "";
		for (int i = 0; i < fruitList.size(); i++) {

			output += String.format("%-10s\n", fruitList.get(i).getFruit());
		}
		return output;
	}
	public static void viewFruits(ArrayList<fruits> fruitList) {
		C206_CaseStudy.setHeader("FRUIT ITEMS");
		String output = retrieveFruits(fruitList);
		System.out.println(output);
	}
	

// Hui Hui , VIEW LunchBoxOrder ITEMS : 
	public static String retrieveLunchBoxOrder(ArrayList<LunchBoxOrder> lbOrderList) {
		String output = String.format("%-10s %-20s %-10s %-10s\n", "Order ID", "Menu Set", "Drink", "Fruit");
		for (int i = 0; i < lbOrderList.size(); i++) {
			output += String.format("%-10s %-20s %-10s %-10s\n", lbOrderList.get(i).getOrdID(),
					lbOrderList.get(i).getMenuset(), lbOrderList.get(i).getDrink(), lbOrderList.get(i).getFruit());
		}
		return output;
	}
	public static void viewLunchBoxOrder(ArrayList<LunchBoxOrder> lbOrderList) {
		C206_CaseStudy.setHeader("Lunch Box Order ITEMS");
		String output = retrieveLunchBoxOrder(lbOrderList);
		System.out.println(output);
	}
	
// Shi hao , VIEW order bill - 
	
	

	

	// ================================= Option 2 Add an item (CRUD - Create) =================================
	
// Chin wei , ADD User account - 
	
	
	
// Desmond & Zhen Hong , ADD MenuItems / Monthly Menu :
	
	
	
// Hui Hui , ADD LunchBoxOrder :
	public static LunchBoxOrder inputLunchBoxOrder(ArrayList<LunchBoxOrder> lbOrderList, ArrayList<menuSet> menuSetList) {

		String ordID = Helper.readString("Enter ordID > ");
		setMenu();
		String menuSet = Helper.readString("Enter menuSet > ");
		String  menuType = "";
		
		//still needs improvement
		for (int i = 0; i < menuSetList.size() ; i++) {
			if (menuSet.equalsIgnoreCase("Western")) {
				menuType += menuSetList.get(0).getMenuItem();
				 
			} else if (menuSet.equalsIgnoreCase("Asian")) {
				menuType += menuSetList.get(1).getMenuItem();
			} else if (menuSet.equalsIgnoreCase("Vegetarian")) {
				menuType += menuSetList.get(2).getMenuItem();
			} else {
				System.out.println("menuSet does not exist. Please choose again!!");
			}
		}
		String drink = Helper.readString("Enter drink > ");
		
		String fruit = Helper.readString("Enter fruit > ");

		LunchBoxOrder lbOrd = new LunchBoxOrder(ordID, menuType, drink, fruit);
		return lbOrd;
	}
	public static void addLunchBoxOrder(ArrayList<LunchBoxOrder> lbOrderList, LunchBoxOrder lbOrd) {
		lbOrderList.add(lbOrd);
	}

	
	
// Shi Hao , ADD ORDER BILL - 
	
	
	
	
	// ================================= Option 3 Delete (CRUD - Remove)================================= 
	
// Chin wei , DELETE user account - 
	
	
	
// Desmond & Zhen Hong ,DELETE MenuItems / Monthly Menu -
	
	
	
// Hui Hui , DELETE LunchBoxOrder - 
	
	
	
// Shi Hao , DELETE Order bill - 
	
	

}
