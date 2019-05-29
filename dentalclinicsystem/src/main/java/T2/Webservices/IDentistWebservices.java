package T2.Webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import T2.staff.Dentist;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface IDentistWebservices {

	
@WebMethod
public Dentist getDentist(int id);

@WebMethod 
public String getString();
}
