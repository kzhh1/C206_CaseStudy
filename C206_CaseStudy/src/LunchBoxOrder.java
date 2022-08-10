
public class LunchBoxOrder { // Committed by Hui
	
	private int ordID ; 
	private String ordDesc ; // order Description
	private String date ; // order Date
	
	
	public LunchBoxOrder(int ordID, String ordDesc, String date) {
		super();
		this.ordID = ordID;
		this.ordDesc = ordDesc;
		this.date = date;
	}


	public int getOrdID() {
		return ordID;
	}

	public String getOrdDesc() {
		return ordDesc;
	}

	public String getDate() {
		return date;
	}
	
	
}
