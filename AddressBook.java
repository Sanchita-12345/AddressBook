package pack2;
import java.io.IOException;
import java.util.Scanner;

public class AddressBook
{
		//variables
		private String firstname;
		private String lastname;
		private String address;
		private String city;
		private String state;
		private String pin;
		private String phoneNumber;
		private String email;

		//constructor
		public AddressBook(String firstname, String lastname, String address, String city, String state, String  pin, String phoneNumber, String email) {

			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
			this.city = city;
			this.state = state;
			this.pin = pin;
			this.phoneNumber = phoneNumber;
			this.email=email;
		}

		// Printing all the information
		public void display() {
			System.out.println(" First Name : " + firstname + "\n Last Name : " + lastname + "\n Address : " + address +
									"\n City : " + city + "\n State : " + state + "\n Pin Code : " + pin +
									"\n Phone Number : " + phoneNumber + "\n Email id : " + email);
		}
		public static void main(String args[])
		{
			System.out.println("Welcome to the AddressBook Program");
			AddressBook obj=new AddressBook( "Sanchita" , "Barik" , "Chandrakona Town" , "West Medinipur" , "West Bengal" , "721201" , "9933637905" , "sanchitabarik40@gmail.com" );
			obj.display();
		}
}
