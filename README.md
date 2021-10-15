# Phase1_project

LockedMe.com is a file management system, designed to act as a virtual key for repositories for Company Lockers Pvt. Ltd. The prototype application allows users to view all the existing files in the directory in ascending order , to perform certain business level operations and to close the application. The source code is written in Java using Eclipse IDE.
The application displays a welcome message and provides the details of the application. The main menu is displayed with three options for the user to select. It is achieved by using switch-case. The first option displays the list of the existing files in the directory in ascending order. The second option opens another menu, which is a nested switch-case. The third option closes the application with a warm message. 

The sub-menu which opens by selecting the second option of the main menu provides a user interface to allow the user to perform following operations.

First option of the sub-menu allows the user to add a file in the directory. If the file already exists, then the respective message is displayed to the user. The main menu is again displayed until the user chooses to close the application.

Second option of the sub-menu allows the user to delete a file from the directory. Case sensitivity is allowed to make sure that only the correct file gets deleted. If the file is not there, “File not found” message is displayed to the user and the application jumps back to the main menu.

Third option of the sub-menu allows the user to delete a file from the directory. Case sensitivity is allowed to make sure that only the correct file gets deleted. If the file is not there, “File not found” message is displayed to the user and the application jumps back to the main menu.

Fourth option of the sub-menu allows the user to navigate back to the main menu.

The exceptions in the code are handled by try catch blocks. To deal with invalid input, if-else loops are used. In case an invalid input is given, the user is provided with the display “Invalid input” and the main menu is shown again until a valid input is given.

:=>> Java concepts used in application

Exception Handling- All the methods are in try catch blocks to handle exceptions

File Handling- Files are managed using file-handling mechanisms, from java.io.file,  and user is allowed to perform business level operations

Collections and Sorting- To sort the files in ascending order, the collection class of java.util.Array is used and sort method is performed on it, to achieve code optimization

Scanner- All the inputs from the user are taken using java.util.scanner class

OOP- All the methods are encapsulated in classes and invoked through objects of the class from the driver class, Menu.java. Abstraction is achieved to hide the internal workflow and provide an abstract user interface. 
