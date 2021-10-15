package LockedMe;

import java.io.*;
import java.util.*;

public class SortFiles {

	public void sortf() {
		
		 File directory = new File("C:\\Users\\somya\\eclipse-workspace\\Phase1_project\\Phase1\\");
		  
	     String[] flist = directory.list();
	     Arrays.sort(flist);
	     for (int i = 0; i < flist.length; i++)
	     {
	    	 System.out.println(flist[i]);
	     }
	}

}
