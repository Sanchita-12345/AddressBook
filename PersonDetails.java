package pack2;

public class PersonDetails {

	public String firstname;
	public String lastname;
	public String address;
	public String city;
	public String state;
	public String pin;
	public String phoneNumber;
	
	PersonDetails(String firstname, String lastname, String address, String city, String state, String  pin, String phoneNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "PersonInformation [FirstName : " + firstname + ", LastName : " + lastname + ", Address : " + address + 
				", city : " + city + ", state : " + state + ", PinCode : " + pin + ", PhoneNumber : " + phoneNumber + "]";
	}
}
