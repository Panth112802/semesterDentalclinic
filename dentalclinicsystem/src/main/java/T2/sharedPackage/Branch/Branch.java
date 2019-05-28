package T2.sharedPackage.Branch;

public class Branch implements IBranch{

	private String branchName;
	private String branchEmail;
	private String branchPhoneNo;
	private String branchNo;
	private int exminationRoom;
	
	
	public String getBranchName() {
		return branchName;
	}


	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}


	public String getBranchEmail() {
		return branchEmail;
	}


	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}


	public String getBranchPhoneNo() {
		return branchPhoneNo;
	}


	public void setBranchPhoneNo(String branchPhoneNo) {
		this.branchPhoneNo = branchPhoneNo;
	}


	public String getBranchNo() {
		return branchNo;
	}


	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}


	public int getExminationRoom() {
		return exminationRoom;
	}


	public void setExminationRoom(int exminationRoom) {
		this.exminationRoom = exminationRoom;
	}


	public Branch(String branchName, String branchEmail, String branchPhoneNo, String branchNo, int exminationRoom) {
		super();
		this.branchName = branchName;
		this.branchEmail = branchEmail;
		this.branchPhoneNo = branchPhoneNo;
		this.branchNo = branchNo;
		this.exminationRoom = exminationRoom;
	}


	
	public Branch getAllBranch() {
		// TODO Auto-generated method stub
		return null;
	}

}
