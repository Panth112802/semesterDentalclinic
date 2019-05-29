package T3.DataLayer.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import T2.patient.Patient;

public class PatientHandler implements PatientHandlerInterface {

	private DatabaseConnection dconn;
	
	public PatientHandler() {
		dconn = new DatabaseConnection();
	}
	
	
	
	
	public ArrayList<Patient> getAllPatient() throws SQLException {
		ArrayList<Patient> temp = new ArrayList<>();
		String  sql = "SELECT * FROM \"DentalClinic\".patient;";
		ResultSet rs = dconn.retriveData(sql);
		try {
			while(rs.next()) {
			String firstName = rs.getString("FirstName");
			String lastName = rs.getString("lastName");
			String CprNo = rs.getString("CprNo");
			String phoneNumber = rs.getString("Phonenumber");
			String Email= rs. getString("Email");
			//String Address= rs.getString("Address");
			temp.add(new Patient(firstName, lastName, CprNo, phoneNumber,Email));
			}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}return temp;
		} 
	}

		
		
	
	
	


    

