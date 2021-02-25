package pack2;
import java.util.*;

public class AddressBook
{
	public static Scanner in = new Scanner(System.in);
	public ArrayList<DisplayOption> contactList = new  ArrayList<>();
	
	//Add contacts
	public void addPersonDetails() {
				
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

		DisplayOption pd = new DisplayOption(firstname, lastname, address, city, state, pin, phoneNumber);
		contactList.add(pd);
	}
	
	//Edit Person's Details
	public boolean editPersonDetails(String name1)
	{
		int flag = 0;
		for(DisplayOption contact : contactList)
		{
			if(contact.getFirstName().equals(name1))
			{
				
				System.out.println("Enter the Address : ");
				String address = in.next();
				contact.setAddress(address);
				System.out.println("Enter the City : ");
				String city = in.next();
				contact.setCity(city);
				System.out.println("Enter the State : ");
				String state = in.next();
				contact.setState(state);
				System.out.println("Enter the Pin");
				String pin = in.next();
				contact.setPin(pin);
				System.out.println("Enter the contact number");
				String phoneNumber = in.next();
				contact.setPhoneNumber(phoneNumber);
				flag = 1;
			}
		}
		return flag == 1;
	}
	
	//Delete Person's Details
	public boolean deletePersonDetails(String name2)
	{
		int flag = 0;
        for(DisplayOption contact: contactList)
        {
            if(contact.getFirstName().equals(name2))
            {
                contactList.remove(contact);
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }
	public void display() {
  		for (DisplayOption person : contactList)				
  			System.out.println(person);
	}
}
