package T2.InvoiceProcedure;

public class Procedure {

	private int procedureType;
	
	private int price;

	public Procedure(int procedureType, int price) {
		super();
		this.procedureType = procedureType;
		this.price = price;
	}

	public int getProcedureType() {
		return procedureType;
	}

	public void setProcedureType(int procedureType) {
		this.procedureType = procedureType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Procedure [procedureType=" + procedureType + ", price=" + price + "]";
	}
	
}
