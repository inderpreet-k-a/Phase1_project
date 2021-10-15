package LockedMe;
import java.util.*;
import java.io.*;

public class AddFile {

	public void add() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the file you want to add in the application:");
		String file_name=sc.next();
		try 
		{
		File f1=new File("C:\\Users\\somya\\eclipse-workspace\\Phase1_project\\Phase1\\"+file_name);
		if(f1.createNewFile())
		{
			System.out.println("File added");
		}
		else
		{
			System.out.println("File already exists");
		}
		}
		catch(Exception e)
		{
			System.out.println("Some error has occurred"+e);
		}
	}
	
}
