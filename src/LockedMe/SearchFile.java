package LockedMe;
import java.io.*;
import java.util.*;

public class SearchFile {

	public void search() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the file you want to search in the application:");
		String file_name=sc.next();
		
		 File directory = new File("C:\\Users\\somya\\eclipse-workspace\\Phase1_project\\Phase1\\");
		  
	     String[] flist = directory.list();
	     int flag = 0;
	     if (flist == null) {
	            System.out.println("Empty directory");
	        }
	        else 
	        	{
	            for (int i = 0; i < flist.length; i++) {
	                String filename = flist[i];
	                if (filename.equals(file_name)) {
	                    System.out.println(filename + " found");
	                    flag = 1;
	                }
	            }
	        }
	  
	        if (flag == 0) {
	            System.out.println("File Not Found");
	        }
	    
	       
	}

	}


