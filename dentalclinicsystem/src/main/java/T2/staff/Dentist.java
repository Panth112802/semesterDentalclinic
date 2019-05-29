package T2.staff;

import java.io.Serializable;



public class Dentist implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	
	
	public Dentist( String firstName, String lastName, int empNo,
			String specialty) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.empNo = empNo;
		this.specialty = specialty;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getEmpNo() {
		return empNo;
	}


	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String getSpecialty() {
		return specialty;
	}


	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}


	private int empNo;
	public String specialty;
	
	
	

	@Override
	public String toString() {
		return "Dentist [firstName=" + firstName + ", lastName=" + lastName + ", empNo=" + empNo + ", specialty="
				+ specialty + "]";
	}


	

		
}
