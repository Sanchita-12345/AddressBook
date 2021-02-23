package pack2;
import java.io.IOException;
import java.util.Scanner;

public class AddressBook
{
	//Add contacts
	static PersonDetails getDataFromConsole() {
		
		Scanner in = new Scanner(System.in);
		
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

		return new PersonDetails(firstname, lastname, address, city, state, pin, phoneNumber);
	}
	
	//Edit Person's Details
	static PersonDetails editPersonDetails(PersonDetails pd) {
		Scanner in = new Scanner(System.in);

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
		return pd;

	}
	public static void main(String args[])
	{
		PersonDetails pd = getDataFromConsole();
		int mychoice;
		
		 while(true)
		 {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your choice \n 1: For Adding person \n 2:For Editing person's details");
			mychoice = in.nextInt();
			switch (mychoice)
			{
				case 1:
					pd = getDataFromConsole();
					break;
					
				case 2:
					System.out.println("Enter the person's First name : ");
					String fName = in.next();
					if(fName.equals(pd.firstname))
						pd = editPersonDetails(pd);
					else
						System.out.println(fName + " First name is no valid ");
					System.out.println(pd);
					break;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}
