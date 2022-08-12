import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {

		//Cheng Hui Hui
		//Friends
		// TODO Auto-generated method stub
		ArrayList<User> UserList = new ArrayList<User>() ; 
		ArrayList<menuSet> menuSetList = new ArrayList<menuSet>() ;
		ArrayList<drinks> drinkList = new ArrayList<drinks>() ; 
		ArrayList<fruits> fruitList = new ArrayList<fruits>() ; 
		ArrayList<LunchBoxOrder> lbOrderList = new ArrayList<LunchBoxOrder>();
		ArrayList<orderbill> orderList = new ArrayList<orderbill>();
		ArrayList<monthlymenu> monthlyList = new ArrayList<monthlymenu>(); 

// Menu :
		menuSetList.add(new menuSet("Chicken Chop"));
		menuSetList.add(new menuSet("Chicken Curry"));
		menuSetList.add(new menuSet("Vegetarian food"));
		drinkList.add(new drinks("Bandung"));
		drinkList.add(new drinks("Water"));
		drinkList.add(new drinks("Teh"));
		fruitList.add(new fruits("Watermelon"));
		fruitList.add(new fruits("Mango"));
		fruitList.add(new fruits("Strawberry"));

		
// LunchBoxOrder : 
		lbOrderList.add(new LunchBoxOrder("lb001" , "Chicken Chop" , "Bandung" , "Mango")) ;
		lbOrderList.add(new LunchBoxOrder("lb002" , "chicken Curry" , "Teh" , "Watermelon")) ; 

		
		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				C206_CaseStudy.viewMenuSet(menuSetList);
				C206_CaseStudy.viewDrinks(drinkList);
				C206_CaseStudy.viewFruits(fruitList);
				
				// View all LunchBoxOrder
				C206_CaseStudy.viewLunchBoxOrder(lbOrderList);
				
				
//				

			} else if (option == 2) {
				// Add a new item
				
				foodMenu();
				int foodOpt = Helper.readInt("Enter option to select food option > ");
//				if(foodOpt == 1) {
//					Camcorder cc = inputCamcorder();
//					ResourceCentre.addCamcorder(camcorderList, cc);
//				}
				
				drinkMenu();
				int drinkOpt = Helper.readInt("Enter option to select drink option  > ");
				fruitMenu();
				int fruitOpt = Helper.readInt("Enter option to select fruit option  > ");
			}
		}
		
	}
				

//				if (foodOpt == 1) {
//					// Add a 
//					 cc = inputCamcorder();
//					C206_CaseStudy.addCamcorder(camcorderList, cc);
//					System.out.println("Camcorder added");
//					
//					C206_CaseStudy.addMenu(foodOpt , drinkOpt , fruitOpt);
//
//				} else if (itemType == 2) {
//					// Add Chromebook
//					Chromebook cb = inputChromebook();
//					C206_CaseStudy.addChromebook(chromebookList, cb);
//					System.out.println("Chromebook added");
//
//					
//					
//				} else {
//					System.out.println("Invalid type");
//				}
//
//			} else if (option == 3) {
//				// Loan item
//				C206_CaseStudy.setHeader("LOAN");			
//				C206_CaseStudy.setHeader("ITEM TYPES");
//				System.out.println("1. Camcorder");
//				System.out.println("2. Chromebook");
//				
//				int itemType = Helper.readInt("Enter option to select item type > ");
//
//				if (itemType == 1) {
//					// Loan camcorderC206_CaseStudy
//					C206_CaseStudy.loanCamcorder(camcorderList);
//				} else if (itemType == 2) {
//					// Loan Chromebook
//					C206_CaseStudy.loanChromebook(chromebookList);
//				} else {
//					System.out.println("Invalid type");
//				}e
//
//			} else if (option == 4) {
//				// Return item
//				C206_CaseStudy.setHeader("RETURN");				
//				C206_CaseStudy.setHeader("ITEM TYPES");
//				System.out.println("1. Camcorder");
//				System.out.println("2. Chromebook");
//				
//				int itemType = Helper.readInt("Enter option to select item type > ");
//				if (itemType == 1) {
//					// Return camcorder
//					C206_CaseStudy.returnCamcorder(camcorderList);
//				} else if (itemType == 2) {
//					// Return Chromebook
//					C206_CaseStudy.returnChromebook(chromebookList);
//				} else {
//					System.out.println("Invalid type");
//				}
//
//			} else if (option == 5) {
//				System.out.println("Bye!");
//			} else {
//				System.out.println("Invalid option");
//			}
//
//		}
//
//	}

	public static void menu() {
		C206_CaseStudy.setHeader("MENU SET");
		System.out.println("1. Display menu");
		System.out.println("2. Add MenuSet");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	public static void foodMenu() {
		C206_CaseStudy.setHeader("Food Menu");
		System.out.println("1.Chicken Chop");
		System.out.println("2.Chicken Curry");
		System.out.println("3.Vegeterian BeeHoon");
		Helper.line(80, "-");

	}
	public static void drinkMenu() {
		C206_CaseStudy.setHeader("Drinks Menu");
		System.out.println("1.Bandung");
		System.out.println("2.Water");
		System.out.println("3.Teh");
		Helper.line(80, "-");
	}
	
	public static void fruitMenu() {
		C206_CaseStudy.setHeader("Fruits Menu");
		System.out.println("1.Watermelon");
		System.out.println("2.Strawberry");
		System.out.println("3.Mango");
		Helper.line(80, "-");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(30, "-");
	}

	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}

	//================================= Option 1 View (CRUD - Read) =================================
	
//MenuItems
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

	
// LunchBoxOrder ITEMS 
	public static String retrieveLunchBoxOrder(ArrayList<LunchBoxOrder> lbOrderList) {
		String output = String.format("%-10s %-20s %-10s %-10s\n", "Order ID" , "Menu Set" , "Drink" , "Fruit");

		for (int i = 0; i < lbOrderList.size(); i++) { 
			output += String.format("%-10s %-20s %-10s %-10s\n", lbOrderList.get(i).getOrdID() , lbOrderList.get(i).getMenuset() , lbOrderList.get(i).getDrink() , lbOrderList.get(i).getFruit() );
		}
		
		return output;
	}
	
	public static void viewLunchBoxOrder(ArrayList <LunchBoxOrder> lbOrderList) {
		C206_CaseStudy.setHeader("Lunch Box Order ITEMS");
		String output = retrieveLunchBoxOrder(lbOrderList);	
		System.out.println(output);
	}
	



	

	
}