import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		ArrayList<menuSet> menuSetList = new ArrayList<menuSet>(); 
		ArrayList<drinks> drinkList = new ArrayList<drinks>(); 
		ArrayList<fruits> fruitList = new ArrayList<fruits>(); 
		ArrayList<LunchBoxOrder> lbOrderList = new ArrayList<LunchBoxOrder>(); 
		ArrayList<orderbill> orderBills = new ArrayList<orderbill>();
		ArrayList<monthlymenu> monthlyList = new ArrayList<monthlymenu>();
		ArrayList<Account> newAccount = new ArrayList<Account>();
		
	// Account:
		newAccount.add(new Account(1,"84651","Mary","Susan"));

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

	// MonthlyMenu(Changes every month)
		monthlyList.add(new monthlymenu("August","Sushi","Lemonade","Mixed berry fruit salad"));
		
	// LunchBoxOrder : 
		lbOrderList.add(new LunchBoxOrder("lb001", "Chicken Chop", "Bandung", "Mango"));
		lbOrderList.add(new LunchBoxOrder("lb002", "chicken Curry", "Teh", "Watermelon"));

	// Orderbill : 
		orderBills.add(new orderbill(1,"Chicken Chop", "Bandung", "Mango", 8.50) );
		
		int option = 0;

		while (option != 6) {

			C206_CaseStudy.mainMenu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				C206_CaseStudy.accountMenu();
				int menuOpt = Helper.readInt("Enter sub option > ") ;
				
		// Chin Wei Code :
				
				if (menuOpt == 1) { 
					// View - 
					C206_CaseStudy.viewAccount(newAccount);
				} else if (menuOpt == 2 ) { 
					// Add - 
					int accountApplicable = Helper.readInt("Enter Account ID check whether it is applicable: ");
					for(int i = 0; i<newAccount.size(); i++) {
						
						if(newAccount.get(i).getAccId() == accountApplicable) {
							System.out.println("Account ID already exists");
							
						}else {
							Account newAccountUser = createAccount();
							C206_CaseStudy.newAccountAdded(newAccount,newAccountUser);
							System.out.println("Created new Account");
							break;
						}
					}
					
				} else if (menuOpt == 3 ) { 
					// Delete -
					C206_CaseStudy.deleteAccount(newAccount);
					
				} else if (menuOpt == 4) {
					System.out.println("Bye!");
				} else {
					System.out.println("Invalid option");
				}	
					
					
				
			} else if (option == 2) {
				C206_CaseStudy.menu();
				int menuOpt = Helper.readInt("Enter sub option > ") ;
				
		// Desmond 's Code :
				
				if (menuOpt == 1) {
					// View all items :
					C206_CaseStudy.viewMenuSet(menuSetList);
					C206_CaseStudy.viewDrinks(drinkList);
					C206_CaseStudy.viewFruits(fruitList);
					
				} else if (menuOpt == 2) { 
					C206_CaseStudy.addmenuSet(menuSetList);
					System.out.println("MenuSet added successfully!");
					C206_CaseStudy.addDrinks(drinkList);
					System.out.println("Drink added successfully!");
					C206_CaseStudy.addFruits(fruitList);
					System.out.println("Fruit added successfully!");
					
				} else if (menuOpt == 3 ) { 
					C206_CaseStudy.deleteMenuSet(menuSetList);
					C206_CaseStudy.deleteDrinks(drinkList);
					C206_CaseStudy.deleteFruits(fruitList);
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
					deleteLunchBoxOrder(lbOrderList) ; 

					
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
					while (price <= 0) {
				    		System.out.println("Price must be more than 0!");
				    		price = Helper.readDouble("Enter Total Price of items > ");
				    }
				    //orderbill.addorderbill
				    orderBills.add(new orderbill(serialnumber, foodname, drinkname, fruitname, price));
					System.out.println("Your order bill has been added.");
					
				} else if (menuOpt == 2 ) { 
					// View - 
					
					int i = Helper.readInt("Enter serial number of entry to view > ");
					
					while (i <= 0 || i > orderBills.size()) {
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
					while (i <= 0 || i > orderBills.size()) {
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
				
				
				
			} else if (option == 5 ) { 
				C206_CaseStudy.monthlyMenu();
				int menuOpt = Helper.readInt("Enter sub option > ") ;
					
		// Zhen Hong's code : 
				
				if (menuOpt == 1) { 
					// View monthly menu : 
					C206_CaseStudy.viewMonthlyMenu(monthlyList);
				} else if (menuOpt == 2) { 
					// Edit monthly menu : 
					monthlymenu mm = inputmonthly();
					C206_CaseStudy.addMonthly(monthlyList, mm);
					System.out.println("Monthly menu added");
					
				}
				else {
					System.out.println("Invalid option");
				}
				
			}else if (option == 6) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

			
		}
	} // end of while loop 


	
	public static void mainMenu() {
		C206_CaseStudy.setHeader("LUNCHBOX MANAGEMENT SYSTEM");
		System.out.println("1. Maintain User Accounts");
		System.out.println("2. Maintain Menu Item Details");
		System.out.println("3. Maintain Lunch Box Order Details");
		System.out.println("4. Maintain Order Bill Details");
		System.out.println("5. Maintain Monthly Item Details");
		System.out.println("6. Quit");
		Helper.line(50, "-");
	}

	public static void menu() {
		C206_CaseStudy.setHeader("MENU OPTIONS");
		System.out.println("1. Display menu");
		System.out.println("2. Add MenuSet");
		System.out.println("3. Delete ");
		System.out.println("4. Quit");
	}
	
	public static void orderBillMenu() {
		C206_CaseStudy.setHeader("MENU OPTIONS");
		System.out.println("1. Add Order Bill");
		System.out.println("2. View Existing Order Bill");
		System.out.println("3. Delete Existing Order Bill");
		System.out.println("4. Quit");
	}
	
	public static void accountMenu() {
    	Helper.line(50, "=");
	    System.out.println("Account");
		System.out.println("1. View Account");
		System.out.println("2. Add Accounts");
		System.out.println("3. Delete Account");
		System.out.println("4. Quit");
		Helper.line(50, "=");
	}
	public static void monthlyMenu() {
		C206_CaseStudy.setHeader("MONTHLY MENU OPTIONS");
		System.out.println("1. View Monthly Menu");
		System.out.println("2. Edit Monthly Menu");
		System.out.println("3. Quit");
	}
// For Menu Items :
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
	

	// ================================= Option 1 View (CRUD - Read)================================= 
	
// Chin wei ,VIEW User account -
	 public static String getAccountInfo(ArrayList<Account> newAccount) {
			String accountOutput = "";
			
			for(int i = 0; i<newAccount.size(); i++) {
				
				accountOutput += String.format("%-15s %-20s %-20s %-15s\n", newAccount.get(i).getAccId(),newAccount.get(i).getPassword(),
						newAccount.get(i).getpName(),newAccount.get(i).getsName());
			}
			return accountOutput;
		}
	public static void viewAccount(ArrayList<Account> newAccount) {
		String accountOutput = String.format("%-15s %-20s %-20s %-15s\n","Account ID","Password" ,"Parent's Name" ,"Student's Name");
		accountOutput += getAccountInfo(newAccount);
		System.out.println(accountOutput);
	}
	

// Desmond , VIEW Menu Items:
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
	
// Zhen Hong , VIEW monthly menu : 
	
	public static String retrieveMonthlymenu(ArrayList<monthlymenu> monthlyList) {
		String output = "";
		for(int i =0;i<monthlyList.size();i++) {
			output = String.format("%-10s %-20s %-10s %-10s\n",monthlyList.get(i).getMonth(),
					monthlyList.get(i).getMenuset(),monthlyList.get(i).getDrink(),monthlyList.get(i).getFruit());
		}
		return output;
	}
	public static void viewMonthlyMenu(ArrayList<monthlymenu> monthlyList) {
		C206_CaseStudy.setHeader("Monthly Menu");
		String output = String.format("%-10s %-20s %-10s %-10s\n","MONTH","MENUSET","DRINKS","FRUITS");
		output += retrieveMonthlymenu(monthlyList);
		System.out.println(output);
	}
	
	

// Hui Hui , VIEW LunchBoxOrder ITEMS : 
	public static String retrieveLunchBoxOrder(ArrayList<LunchBoxOrder> lbOrderList) {
		String output = "" ; 
		for (int i = 0; i < lbOrderList.size(); i++) {
			output += String.format("%-10s %-20s %-10s %-10s\n", lbOrderList.get(i).getOrdID(),
					lbOrderList.get(i).getMenuset(), lbOrderList.get(i).getDrink(), lbOrderList.get(i).getFruit());
		}
		return output;
	}
	public static void viewLunchBoxOrder(ArrayList<LunchBoxOrder> lbOrderList) {
		C206_CaseStudy.setHeader("Lunch Box Order ITEMS");
		String output = String.format("%-10s %-20s %-10s %-10s\n", "Order ID", "Menu Set", "Drink", "Fruit");
		output += retrieveLunchBoxOrder(lbOrderList);
		System.out.println(output);
	}
	

	// ================================= Option 2 Add an item (CRUD - Create) =================================
	
// Chin wei , ADD User account - 
	public static Account createAccount() {
		int accID = Helper.readInt("Enter Account ID: ");
		String Password = Helper.readString("Enter Password: ");
		String pName = Helper.readString("Enter Parent's Name: ");
		String sName = Helper.readString("Enter Student's Name: ");

		Account addAccount = new Account(accID, Password, pName, sName) ;
		return addAccount;
	}
	public static void newAccountAdded(ArrayList<Account> Account, Account newAccountUser) {
		Account.add(newAccountUser);
	}
// Desmond , Add Menuitems :
	public static menuSet addmenuSet(ArrayList<menuSet> menuSetList) {
		String food = Helper.readString("Enter Food: ");

		menuSetList.add(new menuSet(food));
		
		menuSet addmenuSet = new menuSet(food);
		return addmenuSet;
	}
// Desmond , Add Drinkitems :
		public static drinks addDrinks(ArrayList<drinks> drinkList) {
			String drink = Helper.readString("Enter Drink: ");

			drinkList.add(new drinks(drink));
			
			drinks addDrinks = new drinks(drink);
			return addDrinks;
		}	
	
// Desmond , Add Fruititems :
		public static fruits addFruits(ArrayList<fruits> fruitList) {
			String fruit = Helper.readString("Enter Fruit: ");

			fruitList.add(new fruits(fruit));
					
			fruits addFruits = new fruits(fruit);
			return addFruits;
				}	
	
// Zhen Hong , ADD Monthly Menu :
	public static monthlymenu inputmonthly() {
		String month = Helper.readString("Enter Month: ");
		String mmenu = Helper.readString("Enter MenuSet: ");
		String mdrink = Helper.readString("Enter Drink: ");
		String mfruit = Helper.readString("Enter Fruit: ");
		
		monthlymenu mm = new monthlymenu(month,mmenu,mdrink,mfruit);
		return mm;
	}
	public static void addMonthly(ArrayList<monthlymenu> monthlyList, monthlymenu mm) {
		monthlyList.add(mm);
	}
	
// Hui Hui , ADD LunchBoxOrder :
	public static LunchBoxOrder inputLunchBoxOrder(ArrayList<LunchBoxOrder> lbOrderList, ArrayList<menuSet> menuSetList) {

		String ordID = Helper.readString("Enter ordID > ");
		setMenu();
		String menuSet = Helper.readString("Enter menuSet > ");
		String  menuType = "";
		
		for (int i = 0; i < menuSetList.size() ; i++) {
			if (menuSet.equalsIgnoreCase("Western")) {
				menuType += menuSetList.get(0).getMenuItem();
				break ;
			} else if (menuSet.equalsIgnoreCase("Asian")) {
				menuType += menuSetList.get(1).getMenuItem();
				break;
			} else if (menuSet.equalsIgnoreCase("Vegetarian")) {
				menuType += menuSetList.get(2).getMenuItem();
				break;
			} else{
				System.out.println("menuSet does not exist. Please choose again!!");
				menuSet = Helper.readString("Enter menuSet > ");
			}
			
		}// end of for loop 
		String drink = Helper.readString("Enter drink > ");
		String fruit = Helper.readString("Enter fruit > ");

		LunchBoxOrder lbOrd = new LunchBoxOrder(ordID, menuType, drink, fruit);
		return lbOrd;
	}

	public static void addLunchBoxOrder(ArrayList<LunchBoxOrder> lbOrderList, LunchBoxOrder lbOrd) {
		lbOrderList.add(lbOrd);
	}

	
	// ================================= Option 3 Delete (CRUD - Remove)================================= 
	
// Chin wei , DELETE user account - 
	public static void deleteAccount(ArrayList<Account> Account) {
		int accID = Helper.readInt("Enter Account ID:");
		for (int i = 0; i< Account.size(); i++ ) {
			if(Account.get(i).getAccId() == accID) {
				Account.remove(i);
				System.out.println("Account ID " + accID + " deleted!");
			}
		}	
	}

// Desmond , Delete Menuset
	public static void deleteMenuSet(ArrayList<menuSet> menuSetList) {
		String food = Helper.readString("Enter Food: ");
		for (int i = 0; i< menuSetList.size(); i++ ) {
			if(menuSetList.get(i).getMenuItem().equalsIgnoreCase(food)) {
				menuSetList.remove(i);
				System.out.println(food + " has been successfully deleted!");
			}
		}
	}
// Desmond , Delete Drink
	public static void deleteDrinks(ArrayList<drinks> drinkList) {
		String drink = Helper.readString("Enter Drink: ");
		for (int i = 0; i< drinkList.size(); i++ ) {
			if(drinkList.get(i).getDrink().equalsIgnoreCase(drink)) {
				drinkList.remove(i);
				System.out.println(drink + " has been successfully deleted!");
			}
		}
	}
// Desmond , Delete Fruit
	public static void deleteFruits(ArrayList<fruits> fruitList) {
		String fruit = Helper.readString("Enter Fruit: ");
		for (int i = 0; i< fruitList.size(); i++ ) {
			if(fruitList.get(i).getFruit().equalsIgnoreCase(fruit)) {
				fruitList.remove(i);
				System.out.println(fruit + " has been successfully deleted!");
			}
		}
	}
	
	
	
	
// Hui Hui , DELETE LunchBoxOrder - 
	public static void deleteLunchBoxOrder (ArrayList <LunchBoxOrder> lbOrderList ) { 
		
		String ordID = Helper.readString("Enter order ID : ");
		
		boolean isDeleted = doDeletelbOrder(lbOrderList , ordID ) ; 
		
		if ( isDeleted == false ) { 
			System.out.println("Order ID does not exist");
		} else { 
			System.out.println("Order ID " + ordID + " deleted!");
		}
	}// end of deleteLunchBoxOrder() method 
	
	
	public static boolean doDeletelbOrder(ArrayList <LunchBoxOrder> lbOrderList , String ordID ) { 
		boolean isDeleted = false ; 
		
		for (int i = 0 ; i < lbOrderList.size() ; i++ ) { 
			if (ordID.equalsIgnoreCase(lbOrderList.get(i).getOrdID()) ) { 
				lbOrderList.remove(i) ; 
				
				isDeleted = true ; 
			}
		}
		return isDeleted ;
	}// end of doDeletelbOrder() method 


}

	
	
