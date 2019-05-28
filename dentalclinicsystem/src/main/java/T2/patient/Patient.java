package T2.patient;

import java.io.Serializable;

public class Patient implements IPatient, Serializable{

	private String FirstName;
	private String LastName;
	private String CprNo;
	private String Email;
	private String Password;
	public Patient(String firstName, String lastName, String CprNo, String email, String password) {

		this.FirstName = firstName;
		this.LastName = lastName;
		this.CprNo = CprNo;
		this.Email = email;
		this.Password = password;
	}
	


	@Override
	public String toString() {
		return "Patient [FirstName=" + FirstName + ", LastName=" + LastName + ", CprNo=" + CprNo + ", Email=" + Email
				+ ", Password=" + Password + "]";
	}



	
	public String getFirstname() {
		// TODO Auto-generated method stub
		return null;
	}




	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}



	
	public String getCprNo() {
		// TODO Auto-generated method stub
		return null;
	}



	
	public String Email() {
		// TODO Auto-generated method stub
		return null;
	}



	
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

			
	
	
}
