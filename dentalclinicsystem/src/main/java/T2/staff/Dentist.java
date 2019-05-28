package T2.staff;

import java.io.Serializable;

public class Dentist extends Staff implements Serializable {

	private String firstName;
	private String lastName;
	private String empNo;
	public String specialty;
	
	
	public Dentist(String userName, String password, String firstName, String lastName, String empNo,
			String specialty) {
		super(userName, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.empNo = empNo;
		this.specialty = specialty;
	}


	@Override
	public String toString() {
		return "Dentist [firstName=" + firstName + ", lastName=" + lastName + ", empNo=" + empNo + ", specialty="
				+ specialty + "]";
	}

		
}
