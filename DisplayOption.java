package pack2;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayOption {

	public static void display()
	{
		PersonDetails persondetails = null;
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
