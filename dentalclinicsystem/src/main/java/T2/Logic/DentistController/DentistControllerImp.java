package T2.Logic.DentistController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.jws.WebService;

import T2.Webservices.IDentistWebservices;
import T2.staff.Dentist;
import T3.DataLayer.DAO.DatabaseConnection;
import T3.DataLayer.DAO.IDentistHandler;

@WebService(endpointInterface = "T2.Webservices.IDentistWebservices")
public class DentistControllerImp implements IDentistWebservices, IDentistHandler {
	private DatabaseConnection dbconn;
	public DentistControllerImp() {
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
				String Speciality = rs.getString("specialist");
				int dentistId = rs.getInt("dentistid");
				// String Email = rs.getString("Email");
				// String Address= rs.getString("Address");
				tempDentist = new Dentist(firstName, lastName, dentistId, Speciality);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tempDentist;
	}

	@Override
	public ArrayList<Dentist> getAllDentist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return "DENNIS";
	}

}
