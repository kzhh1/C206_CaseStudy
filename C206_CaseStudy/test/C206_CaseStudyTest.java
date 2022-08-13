import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	// Chin Wei : 
	
	
	// Desmond : 
	
	
	// Zhen Hong : 
	private monthlymenu mm1; 
	
	private ArrayList <monthlymenu> monthlyList;
	

	// Hui Hui 
	private LunchBoxOrder lb1 ; 
	private LunchBoxOrder lb2 ; 
	
	private ArrayList <LunchBoxOrder> lbOrderList ; 
	
	// Shi Hao : 
	
	private orderbill ob1 ; 
	
	private ArrayList <orderbill> orderBills ; 
	
	

	public C206_CaseStudyTest() { 
		super() ; 
	}
	

	@Before
	public void setUp() throws Exception {
	// Prepare test data 
		
		// Chin Wei : 
		
		
		// Desmond : 
		
		
		// Zhen Hong : 

		mm1 =new monthlymenu("August","Sushi","Lemonade","Mixed berry fruit salad");

		monthlyList = new ArrayList<monthlymenu>();

		// Hui Hui : 
		lb1 = new LunchBoxOrder("lb001" , "Chicken Chop", "Bandung", "Mango") ;
		lb2 = new LunchBoxOrder("lb002", "chicken Curry", "Teh", "Watermelon") ;
		
		
		lbOrderList = new ArrayList<LunchBoxOrder>() ; 
		// Shi hao :
		
		ob1 = new orderbill(1,"Chicken Chop", "Bandung", "Mango", 8.50) ; 
		
		orderBills = new ArrayList<orderbill>() ; 
		
		

		
	}
	

// ==================== test Adding of classes ====================
	// Chin Wei : 
	@Test 
	public void testAddAccount() { 
		
		
	}
	// Desmond : 
	@Test
	public void testAddMenu() { 
		
		
	}
	// Zhen Hong : 
	
	@Test
	public void testAddMonthlyMenu() { 
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Camcorder arraylist to add to", monthlyList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addMonthly(monthlyList, mm1);
		assertEquals("Check that Camcorder arraylist size is 1", 1, monthlyList.size());
		assertSame("Check that Camcorder is added", mm1, monthlyList.get(0));
	}
	
	//Hui Hui : 
	@Test 
	public void testAddLunchBoxOrder() { 
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid LunchBoxOrder arraylist to add to", lbOrderList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addLunchBoxOrder(lbOrderList, lb1);
		assertEquals("Check that LunchBoxOrder arraylist size is 1", 1, lbOrderList.size());
		assertSame("Check that Lunch Box Order is added", lb1, lbOrderList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addLunchBoxOrder(lbOrderList, lb2);
		assertEquals("Check that LunchBoxOrder arraylist size is 2", 2, lbOrderList.size());
		assertSame("Check that LunchBoxOrder is added", lb2, lbOrderList.get(1));
	}
	
	// Shi Hao : 
	@Test 
	public void testAddOrderBill() { 
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Camcorder arraylist to add to", orderBills );
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		orderBills.add(ob1);
		assertEquals("Check that Camcorder arraylist size is 1", 1, orderBills.size());
		assertSame("Check that Camcorder is added", ob1, orderBills.get(0) );
		
	}
	
	
	// ==================== test Viewing of classes ====================
	// Chin Wei : 
	
	
	// Desmond : 
			
			
	// Zhen Hong : 
	
	@Test
	public void testRetrieveMonthlyMenu() {
		
		//fail("Not yet implemented");
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Monthlymenu arraylist to retrieve item from", monthlyList);
				
		//test if the list of monthlyMenu retrieved from the C206_CaseStudy is empty - boundary
		String allMonthlyMenu = C206_CaseStudy.retrieveMonthlymenu(monthlyList);
		String testOutput = "";
		assertEquals("Test that the retrieved monthlylist is empty?", testOutput, allMonthlyMenu);
	
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addMonthly(monthlyList,mm1);
		assertEquals("Test that chromebook arraylist size is 1", 1, monthlyList.size());
		
		//test if the expected output string same as the list of monthlyMenu retrieved from the C206_CaseStudy	
		allMonthlyMenu = C206_CaseStudy.retrieveMonthlymenu(monthlyList);
		testOutput += String.format("%-10s %-20s %-10s %-10s\n", "August","Sushi","Lemonade","Mixed berry fruit salad" );
		
		assertEquals("Test that viewMonthlyMenu", testOutput, allMonthlyMenu);
	}

	
	// Hui Hui : 
	@Test
	public void testRetrieveLunchBoxOrder() {
		
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid LunchBoxOrder arraylist to retrieve item", lbOrderList);
				
	
		//test if the list of LunchBoxOrder retrieved from the C206_CaseStudy is empty - boundary
		String allLunchBoxOrder= C206_CaseStudy.retrieveLunchBoxOrder(lbOrderList);
		String testOutput = "";
		assertEquals("Check that ViewLunchBoxOrderlist", testOutput, allLunchBoxOrder);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addLunchBoxOrder(lbOrderList, lb1);
		C206_CaseStudy.addLunchBoxOrder(lbOrderList, lb2);
		assertEquals("Test that LunchBoxOrder arraylist size is 2", 2, lbOrderList.size());
		
		//test if the expected output string same as the list of LunchBoxOrder retrieved from C206_CaseStudy	
		allLunchBoxOrder = C206_CaseStudy.retrieveLunchBoxOrder(lbOrderList);
		testOutput = String.format("%-10s %-20s %-10s %-10s\n", "lb001", "Chicken Chop", "Bandung", "Mango");
		testOutput += String.format("%-10s %-20s %-10s %-10s\n", "lb002", "chicken Curry", "Teh", "Watermelon" );
	
		assertEquals("Test that ViewLunchBoxOrderlist", testOutput, allLunchBoxOrder);
		
	}
	
	
	
	// Shi Hao : 
	
	public void testViewOrderBill() {
		
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid OrderBills arraylist to retrieve item", orderBills);
		
		//Given an empty list, after adding an item, test if the size of the list is 1 
		orderBills.add(ob1);
		assertEquals("Test that orderBills arraylist size is 1", 1, orderBills.size());
		orderbill orderbill = orderBills.get(0);
		String testOutput = ("Serial Number: 1\n"
				+ "Your Order:\n" 
				+ "Food of Choice: Chicken Chop\n"
				+ "Drink of Choice: Bandung\n"
				+ "Fruit of Choice: Mango\n"
				+ "Total Cost: $8.50");
		String actualOutput = ("Serial Number: " + orderbill.getSerialnumber() + "\n" +
		"Your Order:\n" +
		"Food of Choice: " + orderbill.getMenuset() + "\n" +
		"Drink of Choice: " + orderbill.getDrink() + "\n" +
		"Fruit of Choice: " + orderbill.getFruit() + "\n" +
		"Total Cost: $" + orderbill.getPrice());
		assertEquals("Test that OrderBill output is the same as test output", testOutput, actualOutput);
	}
			
	
// ==================== test Deleting of classes ====================
	
	// Chin Wei : 
	
	
	// Desmond : 

	
	// Hui Hui - 
	@Test 
	public void testDeletelbOrder() { 
		// test that LunchBoxOrder list is not null , so that can delete orderID . 
		assertNotNull("Test if there is valid LunchBoxOrder arraylist to delete from", lbOrderList);
		C206_CaseStudy.addLunchBoxOrder(lbOrderList, lb1);
		C206_CaseStudy.addLunchBoxOrder(lbOrderList, lb2);
		  
		// Delete another LunchBoxOrder. The size of the list is 1?
		C206_CaseStudy.doDeletelbOrder(lbOrderList, "lb001");
		assertEquals("Test that the LunchBoxOrder arraylist size is 1", 1, lbOrderList.size());
		  
		// Delete another LunchBoxOrder. The size of the list is 0?
		C206_CaseStudy.doDeletelbOrder(lbOrderList, "lb002");
		assertEquals("Test that the LunchBoxOrder arraylist size is 0", 0, lbOrderList.size());
	}
	
	// Shi Hao : 
	public void testDeleteOrderBill() { 
		assertNotNull("Test if there is valid OrderBills arraylist to delete from", orderBills);
		orderBills.add(ob1);
		
		  
		// Delete an Orderbill. CHeck that size is 0
		orderBills.remove(0);
		assertEquals("Test that the LunchBoxOrder arraylist size is 0", 0, lbOrderList.size());

	}
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
		// Chin Wei : 
		
		
		// Desmond : 
		
		
		// Zhen Hong : 
		mm1 = null;
		monthlyList = null ; 

		// Hui Hui : 
		lb1 = null ;
		lb2 = null ; 
		lbOrderList = null ; 
		
		
		// Shi hao :
		ob1 = null ; 
		orderBills = null ; 
		
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
