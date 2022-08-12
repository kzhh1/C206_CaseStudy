
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
	/**
	 * @param loginID
	 * @param password
	 * @param username
	 */
	public User(int loginID, String password, String username) {
		super();
		this.loginID = loginID;
		this.password = password;
		this.username = username;
	}
	/**
	 * @return the loginID
	 */
	public int getLoginID() {
		return loginID;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}	
}
