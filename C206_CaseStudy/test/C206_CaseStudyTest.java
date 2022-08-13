import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	// Chin Wei : 
	
	
	// Desmond : 
	
	
	// Zhen Hong : 
	private monthlymenu m1; 
	
	private ArrayList <monthlymenu> monthlyList;
	

	// Hui Hui 
	private LunchBoxOrder lb1 ; 
	private LunchBoxOrder lb2 ; 
	
	private ArrayList <LunchBoxOrder> lbOrderList ; 
	
	// Shi Hao : 
	
	

	public C206_CaseStudyTest() { 
		super() ; 
	}
	
	
	
	@Before
	public void setUp() throws Exception {
	// Prepare test data 
		
		// Chin Wei : 
		
		
		// Desmond : 
		
		
		// Zhen Hong : 
		m1 =new monthlymenu("August","Sushi","Lemonade","Mixed berry fruit salad");
		
		monthlyList = new ArrayList<monthlymenu>();

		// Hui Hui : 
		lb1 = new LunchBoxOrder("lb001" , "Chicken Chop", "Bandung", "Mango") ;
		lb2 = new LunchBoxOrder("lb002", "chicken Curry", "Teh", "Watermelon") ;
		
		
		lbOrderList = new ArrayList<LunchBoxOrder>() ; 
		// Shi hao :
		

		
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
		C206_CaseStudy.addMonthly(monthlyList, m1);
		assertEquals("Check that Camcorder arraylist size is 1", 1, monthlyList.size());
		assertSame("Check that Camcorder is added", m1, monthlyList.get(0));
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
		
	}
	
	
	// ==================== test Viewing of classes ====================
	// Chin Wei : 
	
	
	// Desmond : 
			
			
	// Zhen Hong : 
	
	@Test
	public void testRetrieveMonthlyMenu() {
		//fail("Not yet implemented");
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Chromebook arraylist to retrieve item from", monthlyList);
		
		//test if the list of Chromebook retrieved from the SourceCentre is empty - boundary
		String allMonthlyMenu = C206_CaseStudy.retrieveMonthlymenu(monthlyList);
		String testOutput = "";
		assertEquals("Test that the retrieved Chromebooklist is empty?", testOutput, allMonthlyMenu);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addmonthly(monthlyList);
		assertEquals("Test that chromebook arraylist size is 2", 1, monthlyList.size());
		
		//test if the expected output string same as the list of chromebooks retrieved from the SourceCentre	
		allMonthlyMenu= C206_CaseStudy.retrieveMonthlymenu(monthlyList);
		testOutput += String.format("%-10s %-20s %-10s %-10s\n", "August","Sushi","Lemonade","Mixed berry fruit salad" );
		
		
		assertEquals("Test that ViewAllChromebooklist", testOutput, allMonthlyMenu);
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
			
	
// ==================== test Deleting of classes ====================
	
	// Chin Wei : 
	
	
	// Desmond : 
	
	
	// Zhen Hong : 
	
	
	// Hui Hui - 
	@Test 
	public void testDeletelbOrder() { 
		
	}
	
	// Shi Hao : 
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
		// Chin Wei : 
		
		
		// Desmond : 
		
		
		// Zhen Hong : 
		m1 = null;
		monthlyList = null ; 

		// Hui Hui : 
		lb1 = null ;
		lb2 = null ; 
		lbOrderList = null ; 
		
		
		// Shi hao :
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
