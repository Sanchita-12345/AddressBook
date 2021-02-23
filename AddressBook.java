package pack2;
import java.io.IOException;
import java.util.Scanner;

public class AddressBook
{
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

	public static void main(String args[])
	{
		PersonDetails pd = getDataFromConsole();
		int mychoice;

		 while(true)
		 {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your choice \n 1: For Adding person");
			mychoice = in.nextInt();
			switch (mychoice)
			{
				case 1:
					pd = getDataFromConsole();
					break;
				default:
					System.out.println("Invalid Input");
			}
		}
	}
}
