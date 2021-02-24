package pack2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class AddressBook
{
	
	ArrayList<PersonDetails> a1 = null;
	AddressBook()
	{
		a1 = new ArrayList();
	}
	
	Scanner in = new Scanner(System.in);
	static PersonDetails pd = null;
	
	//Add contacts
	public void getDataFromConsole() {
				
		System.out.println("Enter the First name : ");
		String firstname = in.next();
		System.out.println("Enter the Last name : ");
		String lastname = in.next();
		System.out.println("Enter the Address : ");
		String address = in.next();
		System.out.println("Enter the City : ");
		String city = in.next();
		System.out.println("Enter the State : ");
		String state = in.next();
		System.out.println("Enter the Pin : ");
		String pin = in.next();
		System.out.println("Enter the contact number : ");
		String phoneNumber = in.next();

		a1.add(new PersonDetails(firstname, lastname, address, city, state, pin, phoneNumber));
	}
	
	//Edit Person's Details
	public void editPersonDetails(PersonDetails pd)
	{

		System.out.println("Enter the Address : ");
		pd.address = in.next();
		System.out.println("Enter the City : ");
		pd.city = in.next();
		System.out.println("Enter the State : ");
		pd.state = in.next();
		System.out.println("Enter the Pin");
		pd.pin = in.next();
		System.out.println("Enter the contact number...");
		pd.phoneNumber = in.next();
	}
	
	//Delete Person's Details
	public void deletePersonDetails(PersonDetails pd)
	{
		a1.remove(pd);
	}
}
