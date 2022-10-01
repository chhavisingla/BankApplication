package p5;

public class ContactDetails {
	String houseNumber;
	String localityNumber;
	String cityName;
	String stateName;
	String countryName;
	long pincode;
	long mobileNumber;
	long emailId;
	public ContactDetails(String houseNumber, String localityNumber, String cityName, String stateName,
			String countryName, long pincode, long mobileNumber, long emailId) {
		super();
		this.houseNumber = houseNumber;
		this.localityNumber = localityNumber;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
		this.pincode = pincode;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getLocalityNumber() {
		return localityNumber;
	}
	public void setLocalityNumber(String localityNumber) {
		this.localityNumber = localityNumber;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public long getEmailId() {
		return emailId;
	}
	public void setEmailId(long emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "ContactDetails [houseNumber=" + houseNumber + ", localityNumber=" + localityNumber + ", cityName="
				+ cityName + ", stateName=" + stateName + ", countryName=" + countryName + ", pincode=" + pincode
				+ ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", getHouseNumber()=" + getHouseNumber()
				+ ", getLocalityNumber()=" + getLocalityNumber() + ", getCityName()=" + getCityName()
				+ ", getStateName()=" + getStateName() + ", getCountryName()=" + getCountryName() + ", getPincode()="
				+ getPincode() + ", getMobileNumber()=" + getMobileNumber() + ", getEmailId()=" + getEmailId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
