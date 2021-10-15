package LockedMe;
import java.util.*;

public class Menu {

	public static void main(String[] args) {
			
		
		System.out.println("**********Welcome to LockedMe.com***********\n");
		System.out.println("This is a file management application \ndeveloped by Inderpreet Kaur Anand 'inderpreet.k.anand@gmail.com'\n\n");
		
		mainMenu();
	}
	
		public static void mainMenu()
		{
			
			AddFile a=new AddFile();
			DeleteFile d=new DeleteFile();
			SearchFile s=new SearchFile();
			SortFiles st=new SortFiles();	
		
		System.out.println("\nSelect an option and enter respective number 1/2/3\n");
		System.out.println("Enter 1 to see a list of all files in the application in ascending order");
		System.out.println("Enter 2 to see the file managememt options");
		System.out.println("Enter 3 to close the application");
		
		Scanner sc=new Scanner(System.in);
		int opt=sc.nextInt();
		
		if(opt<1 || opt>3)
		{
			System.out.println("Invalid input...please enter again");
			mainMenu();
		}
		else {
		switch(opt)
		{
		case 1: st.sortf();
		mainMenu();
		break;
		
		case 2: System.out.println("Select an option and enter respective number 1/2/3/4\n");
				System.out.println("Enter 1 to add a file to the directory");
				System.out.println("Enter 2 to delete a file from the directory");
				System.out.println("Enter 3 to search a file in the directory");
				System.out.println("Enter 4 to go back to the main menu");
				
				int new_opt=sc.nextInt();
				
				if (new_opt<1 || new_opt>4)
				{
					System.out.println("Invalid input...going back to main menu");
					mainMenu();
				}
				
				else {
				switch(new_opt)
				{
				case 1: a.add();
				break;
				
				case 2: d.delete();
				break;
				
				case 3: s.search();
				break;
				
				case 4: mainMenu();
				break;
				}
				mainMenu();
				break;}
				
		case 3: System.out.println("Thanks for using LockedMe.com!! \nClosing the application....");
		System.exit(0);
		
		}
		

		}
		
	}

}
