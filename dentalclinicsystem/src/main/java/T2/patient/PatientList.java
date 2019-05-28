package T2.patient;

import java.io.Serializable;
import java.util.ArrayList;

public class PatientList implements Serializable {

	private ArrayList<Patient>patientlist;

	public PatientList() {
		
		patientlist = new ArrayList<Patient>();
		
	}
	
	public void addPatient(Patient patient) {
		patientlist.add(patient);
	}
	public void removePatient(Patient patient) {
		patientlist.remove(patient);
	}
}
