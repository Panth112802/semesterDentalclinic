package T2.sharedPackage.Appointment;

import java.util.Date;
import java.util.Timer;

public class Appointment implements IAppointment{

	private Timer time;
	private Date date;
	private Notification notification;
	
		
	public Appointment(Timer time, Date date) {
		super();
		this.time = time;
		this.date = date;
	}
	

	@Override
	public String toString() {
		return "Appointment [time=" + time + ", date=" + date + "]";
	}


	
	public Timer getAllTime() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Date getAllDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
