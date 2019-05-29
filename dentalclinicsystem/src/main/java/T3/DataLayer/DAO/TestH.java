package T3.DataLayer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import T2.staff.Dentist;

public class TestH {

	public static void main(String[] args) {
	
		ArrayList <Dentist> temp = new ArrayList<>(); 
		PatientHandler ph = new PatientHandler();
		DentistHandler dh = new DentistHandler();
	
	try {
		System.out.println(dh.getDentist(2).getFirstName());
		System.out.println(dh.getAllDentist());
		System.out.println();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}
