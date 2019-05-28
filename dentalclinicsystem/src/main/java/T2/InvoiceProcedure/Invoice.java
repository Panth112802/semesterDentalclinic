package T2.InvoiceProcedure;

public class Invoice implements IInvoiceProcedure{

	private Procedure procedure;
	public int totalPrice;
	public Invoice(Procedure procedure, int totalPrice) {
		super();
		this.procedure = procedure;
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "Invoice [procedure=" + procedure + ", totalPrice=" + totalPrice + "]";
	}
	public Procedure getTotalPrice() {
		// TODO Auto-generated method stub
		return null;
	}
		
	
}
