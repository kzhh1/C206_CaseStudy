
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21021860, 10 Aug 2022 2:26:26 pm
 */

public class User {
	
	private int loginID ; 
	private String password ;
	private String username ;
	
	
	public User(int loginID, String password, String username) {
		super();
		this.loginID = loginID;
		this.password = password;
		this.username = username;
	}
	
	public int getLoginID() {
		return loginID;
	}

	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}	
}
