package T3.DataLayer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import T2.patient.Patient;

public interface PatientHandlerInterface {

	public ArrayList<Patient> getAllPatient() throws SQLException;
}
