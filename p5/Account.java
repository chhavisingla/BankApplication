package p5;

public class Account {
	private long accountNumber;
	String userName;
	String password;
	int balance;
	
	private KYCVerification kycdetails;
	private ContactDetails contactDetails;
	public Account(long accountNumber, String userName, String password, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public KYCVerification getKycdetails() {
		return kycdetails;
	}
	public void setKycdetails(KYCVerification kycdetails) {
		this.kycdetails = kycdetails;
	}
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", userName=" + userName + ", password=" + password
				+ ", balance=" + balance + ", getAccountNumber()=" + getAccountNumber() + ", getUserName()="
				+ getUserName() + ", getPassword()=" + getPassword() + ", getBalance()=" + getBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
