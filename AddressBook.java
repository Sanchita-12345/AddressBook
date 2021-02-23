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
		String fName1 = in.next();
		ArrayList<PersonDetails> personlist1 = a1;
		for (int i=0; i<personlist1.size(); i++)
		{
			if(personlist1.get(i).firstname.equals(fName1))
			{
				personlist1.remove(i);
			}
		}
	}
	
	public static void main(String args[])
	{
		AddressBook abook = new AddressBook();
		int mychoice;
		
		 while(true)
		 {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your choice \n 1: For Adding person \n 2:For Editing person's details \n 3:For Deleting person's details \n 4:Display");
			mychoice = in.nextInt();
			switch (mychoice)
			{
				case 1:
					abook.getDataFromConsole();
					break;
					
				case 2:
					System.out.println("Enter the person's First name : ");
					String fName = in.next();
					ArrayList<PersonDetails> personlist = abook.a1;
					for(int i=0; i<personlist.size();i++)
					{
						if(personlist.get(i).firstname.equals(fName))
						{
							
							PersonDetails pds = personlist.get(i);
							abook.editPersonDetails(pds);
						}
						System.out.println(fName + " First name is not valid ");
					}
					break;
					
				case 3:
					System.out.println("Enter the person's First name : ");
					String fName1 = in.next();
					ArrayList<PersonDetails> personlist1 = abook.a1;
					for(int i=0; i<personlist1.size();i++)
					{
						if(personlist1.get(i).firstname.equals(fName1))
						{
							PersonDetails pds = personlist1.get(i);
							abook.deletePersonDetails(pds);
						}
						System.out.println(fName1 + " First name is not valid ");
					}
					break;
					
				case 4:
					System.out.println(abook.a1);
					System.out.println();
					break;
					
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}
