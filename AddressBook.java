package pack2;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBook
{
	public static Scanner in = new Scanner(System.in);
	public ArrayList<DisplayOption> contactList = new  ArrayList<>();
	
	//Add contacts
	public void addPersonDetails() {
				
		System.out.println("Enter the First name : ");
		String firstname = in.next();
		if (checkDuplicate(firstname)) {
            System.out.println("Person is already exist");
        }
		else {
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
	}
	
	//Edit Person's Details
	public boolean editPersonDetails(String name1)
	{
		int flag = 0;
		for(DisplayOption contact : contactList)
		{
			if(contact.getFirstName().equals(name1))
			{
				Scanner in = new Scanner(System.in);
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
	
	//check duplicate person's Details
	 public boolean checkDuplicate(String name3)
	 {
	     int flag = 0;
	     for (DisplayOption duplicateContact: contactList)
	     {
	         if (duplicateContact.getFirstName().equals(name3))
	         {
	             flag = 1;
	             break;
	         }
	     }
	     return flag == 1;
    }
	 
	 //get person's name by state
	 public void getPersonNameByState(String State) 
	 {
		List<DisplayOption> list = contactList.stream().filter(contactName -> contactName.getState().equals(State))
								   .collect(Collectors.toList());
		for (DisplayOption contact : list) {
			System.out.println("First Name: " + contact.getFirstName());
			System.out.println("Last Name: " + contact.getLastName());
		}
	}

	 //get person's name by city
	public void getPersonNameByCity(String cityName) {
		List<DisplayOption> list = contactList.stream().filter(contactName -> contactName.getCity().equals(cityName))
								   .collect(Collectors.toList());
		for (DisplayOption contact : list) {
			System.out.println("First Name: " + contact.getFirstName());
			System.out.println("Last Name: " + contact.getLastName());
		}
	}
}
