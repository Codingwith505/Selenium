
public class User {

	private String name;
	private String username;
	private String password;
	private Long phoneNumber;

	public User(String name, String username, String password, Long phoneNumber) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public Long getphoneNumber() {
		return phoneNumber;
	}

	public void setphoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	
	

	public boolean comparePhoneNumber(User user) {
//       boolean flag this.phoneNumber.equals(getpassword());
		return this.phoneNumber.equals(user.getphoneNumber());

	}

}
