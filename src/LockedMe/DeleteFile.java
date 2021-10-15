package LockedMe;

import java.io.*;
import java.util.Scanner;

public class DeleteFile {

	public void delete() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the file you want to delete from the application:");
		String file_name=sc.next();
		try 
		{
		File f1=new File(file_name);
		if(f1.delete())
		{
			System.out.println("File deleted");
		}
		else
		{
			System.out.println("File not found");
		}
		}
		catch(Exception e)
		{
			System.out.println("Some error has occurred"+e);
		}


	}

}
