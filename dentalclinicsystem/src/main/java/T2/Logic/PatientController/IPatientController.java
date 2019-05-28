package T2.Logic.PatientController;

import java.sql.SQLException;
import java.util.ArrayList;

import T2.patient.Patient;

public interface IPatientController {

	public ArrayList<Patient> getAllPatient() throws SQLException;
	
	public Patient getPatientByCprNo(String CprNumber);
	
	public Patient addPatient(Patient patient);
	
	public void removePatient(Patient patient);
	
	public Patient editPatient(Patient patient);
	
}
