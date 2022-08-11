import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayList<User> UserList = new ArrayList<User>() ; 
		ArrayList<menu> menuList = new ArrayList<menu>() ; 
		ArrayList<LunchBoxOrder> lbOrderList = new ArrayList<LunchBoxOrder>();
		ArrayList<orderbill> orderList = new ArrayList<orderbill>();
		ArrayList<monthlymenu> monthlyList = new ArrayList<monthlymenu>(); 

		menuList.add(new menu("Western","Asian","Vegeterian"));
		menuList.add(new menu("Asian","",""));
		menuList.add(new menu("Western","Milo","Watermelon"));
		menuList.add(new menu("Western","Milo","Watermelon"));
		menuList.add(new menu("Western","Milo","Watermelon"));
		menuList.add(new menu("Western","Milo","Watermelon"));
		
		int option = 0;

		while (option != 5) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				C206_CaseStudy.viewAllCamcorder();
				C206_CaseStudy.viewAllChromebook(chromebookList);

			} else if (option == 2) {
				// Add a new item
				
				foodMenu();
				int foodOpt = Helper.readInt("Enter option to select food option > ");
				drinkMenu();
				int drinkOpt = Helper.readInt("Enter option to select drink option  > ");
				fruitMenu();
				int fruitOpt = Helper.readInt("Enter option to select fruit option  > ");
				

				if (itemType == 1) {
					// Add a camcorder
					Camcorder cc = inputCamcorder();
					C206_CaseStudy.addCamcorder(camcorderList, cc);
					System.out.println("Camcorder added");

				} else if (itemType == 2) {
					// Add Chromebook
					Chromebook cb = inputChromebook();
					C206_CaseStudy.addChromebook(chromebookList, cb);
					System.out.println("Chromebook added");

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				// Loan item
				C206_CaseStudy.setHeader("LOAN");			
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Loan camcorderC206_CaseStudy
					C206_CaseStudy.loanCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Loan Chromebook
					C206_CaseStudy.loanChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 4) {
				// Return item
				C206_CaseStudy.setHeader("RETURN");				
				C206_CaseStudy.setHeader("ITEM TYPES");
				System.out.println("1. Camcorder");
				System.out.println("2. Chromebook");
				
				int itemType = Helper.readInt("Enter option to select item type > ");
				if (itemType == 1) {
					// Return camcorder
					C206_CaseStudy.returnCamcorder(camcorderList);
				} else if (itemType == 2) {
					// Return Chromebook
					C206_CaseStudy.returnChromebook(chromebookList);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 5) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void menu() {
		C206_CaseStudy.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Loan item");
		System.out.println("4. Return item");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	public static void foodMenu() {
		C206_CaseStudy.setHeader("Food Menu");
		System.out.println("1.Asian");
		System.out.println("2.Western");
		System.out.println("3.Vegeterian");
		Helper.line(80, "-");

	}
	public static void drinkMenu() {
		C206_CaseStudy.setHeader("Drinks Menu");
		System.out.println("1.Milo");
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
		Helper.line(80, "-");
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
	public static String retrieveAllCamcorder(ArrayList<Camcorder> camcorderList) {
		String output = "";

		for (int i = 0; i < camcorderList.size(); i++) {

			output += String.format("%-10s %-30s %-10s %-10s %-20d\n", camcorderList.get(i).getAssetTag(),
					camcorderList.get(i).getDescription(), 
					C206_CaseStudy.showAvailability(camcorderList.get(i).getIsAvailable()),
					camcorderList.get(i).getDueDate(),camcorderList.get(i).getOpticalZoom());
		}
		return output;
	}
	public static void viewAllCamcorder(ArrayList<Camcorder> camcorderList) {
		C206_CaseStudy.setHeader("CAMCORDER LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ASSET TAG", "DESCRIPTION",
				"AVAILABLE", "DUE DATE","OPTICAL ZOOM");
		 output += retrieveAllCamcorder(camcorderList);	
		System.out.println(output);
	}

	public static String retrieveAllChromebook(ArrayList<Chromebook> chromebookList) {
		String output = "";
		// write your code here
		for (int i = 0; i < chromebookList.size(); i++) {

			output += String.format("%-10s %-30s %-10s %-10s %-20s\n", chromebookList.get(i).getAssetTag(),
					chromebookList.get(i).getDescription(), 
					C206_CaseStudy.showAvailability(chromebookList.get(i).getIsAvailable()),
					chromebookList.get(i).getDueDate(),chromebookList.get(i).getOs());
		}
		return output;
	}
	public static void viewAllChromebook(ArrayList<Chromebook> chromebookList) {
		
		C206_CaseStudy.setHeader("CHROMEBOOK LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ASSET TAG", "DESCRIPTION",
				 "AVAILABLE", "DUE DATE","OPERATING SYSTEM");
		 output += retrieveAllChromebook(chromebookList);
		System.out.println(output);
	}

	//================================= Option 2 Add (CRUD - Create)=================================
	public static Camcorder inputCamcorder() {
		String tag = Helper.readString("Enter asset tag > ");
		String description = Helper.readString("Enter description > ");
		int zoom = Helper.readInt("Enter optical zoom > ");

		Camcorder cc= new Camcorder(tag, description, zoom);
		return cc;
		
	}
	public static void addCamcorder(ArrayList<Camcorder> camcorderList, Camcorder cc) {
		
		camcorderList.add(cc);
		
	}
	
	public static Chromebook inputChromebook() {
		String tag = Helper.readString("Enter asset tag > ");
		String description = Helper.readString("Enter description > ");
		String os = Helper.readString("Enter operating system > ");

		Chromebook cb= new Chromebook(tag, description, os);
		return cb;
		
	}	
	public static void addChromebook(ArrayList<Chromebook> chromebookList, Chromebook cb) {

		chromebookList.add(cb);
		
	}
	
	//================================= Option 3 Loan (CURD- Update) =================================
	public static boolean doLoanCamcorder(ArrayList<Camcorder> camcorderList, String tag, String dueDate) {
		
		boolean isLoaned = false;

		for (int i = 0; i < camcorderList.size(); i++) {
			
			
			if (tag.equalsIgnoreCase(camcorderList.get(i).getAssetTag())				
					&& camcorderList.get(i).getIsAvailable() == true) {
				
				camcorderList.get(i).setIsAvailable(false);
				camcorderList.get(i).setDueDate(dueDate);
				
				isLoaned = true;
				
			}
		}
		return isLoaned;
	}

	public static void loanCamcorder(ArrayList<Camcorder> camcorderList) {
		C206_CaseStudy.viewAllCamcorder(camcorderList);
		String tag = Helper.readString("Enter asset tag > ");
		String due = Helper.readString("Enter due date > ");
		Boolean isLoaned =doLoanCamcorder(camcorderList, tag, due);
		if (isLoaned == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Camcorder " + tag + " loaned out");
		}
	}
	

	public static boolean doLoanChromebook(ArrayList<Chromebook> chromebookList, String tag, String dueDate) {
		// comments: write your code here
		boolean isLoaned = false;

		for (int i = 0; i < chromebookList.size(); i++) {

			if (tag.equalsIgnoreCase(chromebookList.get(i).getAssetTag())
					
					&& chromebookList.get(i).getIsAvailable() == true) {
				
				chromebookList.get(i).setIsAvailable(false);
				chromebookList.get(i).setDueDate(dueDate);
				
				isLoaned = true;
				
			}
		}
		return isLoaned;
	}

	public static void loanChromebook(ArrayList<Chromebook> chromebookList) {
		// write your code here
		C206_CaseStudy.viewAllChromebook(chromebookList);
		String tag = Helper.readString("Enter asset tag > ");
		String due = Helper.readString("Enter due date > ");
		Boolean isLoaned =doLoanChromebook(chromebookList, tag, due);
		if (isLoaned == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Chromebook " + tag + " loaned out");
		}	
		
	}
	//================================= Option 4 Return (CURD- Update)=================================
	public static boolean doReturnCamcorder(ArrayList<Camcorder> camcorderList,String tag) {
		boolean isReturned = false;

		for (int i = 0; i < camcorderList.size(); i++) {
			if (tag.equalsIgnoreCase(camcorderList.get(i).getAssetTag())
					&& camcorderList.get(i).getIsAvailable() == false) {
				camcorderList.get(i).setIsAvailable(true);
				camcorderList.get(i).setDueDate("");
				isReturned = true;
				
			}
		}
		return isReturned;
		
	}

	public static void returnCamcorder(ArrayList<Camcorder> camcorderList) {
		C206_CaseStudy.viewAllCamcorder(camcorderList);
		String tag = Helper.readString("Enter asset tag > ");
		Boolean isReturned = doReturnCamcorder(camcorderList, tag);
		
		if (isReturned == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Camcorder " + tag + " returned");
		}
	}
	// write your doReturnChromebook code here
	public static boolean doReturnChromebook(ArrayList<Chromebook> chromebookList,String tag) {
		boolean isReturned = false;

		for (int i = 0; i < chromebookList.size(); i++) {
			if (tag.equalsIgnoreCase(chromebookList.get(i).getAssetTag())
					&& chromebookList.get(i).getIsAvailable() == false) {
				chromebookList.get(i).setIsAvailable(true);
				chromebookList.get(i).setDueDate("");
				isReturned = true;
				
			}
		}
		return isReturned;
		
	}
	public static void returnChromebook(ArrayList<Chromebook> chromebookList) {
		// write your code here
		C206_CaseStudy.viewAllChromebook(chromebookList);
		String tag = Helper.readString("Enter asset tag > ");
		Boolean isReturned = doReturnChromebook(chromebookList, tag);
		
		if (isReturned == false) {
			System.out.println("Invalid asset tag");
		} else {
			System.out.println("Chromebook " + tag + " returned");
		}
	}




	}


