package T2.staff;

import java.io.Serializable;

public class Staff implements Serializable, IStaff{

	private String userName;
	private String password;
	public Staff(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public String toString() {
		return "Staff [userName=" + userName + ", password=" + password + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String gerUserName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String Dentist() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public T2.staff.Dentist getAllDentist() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
