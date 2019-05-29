package T3.DataLayer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import T2.staff.Dentist;

public interface IDentistHandler {

	public Dentist getDentist(int id);
	public ArrayList<Dentist> getAllDentist() throws SQLException;
	
}
