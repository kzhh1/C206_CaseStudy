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
		m1 =(new monthlymenu("August","Sushi","Lemonade","Mixed berry fruit salad"));
		
		monthlyList = new ArrayList<monthlymenu>();

		// Hui Hui : 
		
		lb1 = new LunchBoxOrder("lb001" , "Chicken Chop", "Bandung", "Mango") ;
		lb2 = new LunchBoxOrder("lb002", "chicken Curry", "Teh", "Watermelon") ;
		
		
		lbOrderList = new ArrayList<LunchBoxOrder>() ; 
		// Shi hao :
		

		
	}
	
// ==================== test Viewing of classes ====================
	
	
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
		
		
	}
	// Shi Hao : 
	@Test 
	public void testAddOrderBill() { 
		
	}
	
	
	
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
