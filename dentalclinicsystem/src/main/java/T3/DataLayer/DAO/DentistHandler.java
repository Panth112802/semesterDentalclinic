package T3.DataLayer.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import T2.patient.Patient;
import T2.staff.Dentist;

public class DentistHandler implements IDentistHandler {
	private DatabaseConnection dbconn;

	public DentistHandler() {

		dbconn = new DatabaseConnection();

	}

	@Override
	public Dentist getDentist(int id) {
		Dentist tempDentist = null;
		String sql = "select * from \"DentalClinic\".dentist where dentistid= " + id + " ;";

		ResultSet rs = dbconn.retriveData(sql);
		try {
			while (rs.next()) {
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("lastName");
				String Speciality= rs.getString("specialist");
				int dentistId = rs.getInt("dentistid");
				//String Email = rs.getString("Email");
				// String Address= rs.getString("Address");
				tempDentist = new Dentist(firstName, lastName, dentistId, Speciality);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempDentist;
	}

	public ArrayList<Dentist> getAllDentist() throws SQLException {
		ArrayList<Dentist> dentistList = new ArrayList<Dentist>();
		String sql = "SELECT * FROM \"DentalClinic\".dentist;";

		ResultSet rs = dbconn.retriveData(sql);
		
		try {
			while (rs.next()) {
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("lastName");
				String Speciality= rs.getString("specialist");
				int dentistId = rs.getInt("dentistid");
				//String Email = rs.getString("Email");
				// String Address= rs.getString("Address");
				dentistList.add(new Dentist(firstName, lastName, dentistId, Speciality));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(dentistList.size());
		return dentistList;
	}

}
