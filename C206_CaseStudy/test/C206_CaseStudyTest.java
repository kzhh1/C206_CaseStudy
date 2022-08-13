import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	// Chin Wei : 
	
	
	// Desmond : 
	private ArrayList<menuSet> menuSetList;
	private ArrayList<drinks> drinkList;
	private ArrayList<fruits> fruitList;
	private void viewMenuSet() {
	}
	private void viewDrinks() {
	}
	private void viewFruits() {
	}
	
	// Zhen Hong : 
	
	

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
