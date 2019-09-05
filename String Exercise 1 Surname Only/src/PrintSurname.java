import java.util.Scanner;

// Student Name : 		Daniel Kenny
// Date :				6/11/2017
// Purpose : 			

/*
1) Write and test a program which will prompt the user to 
enter their name, read in the name, and write to the screen just the surname. 
(Where surname is interpreted as everything after the first space).
*/
public class PrintSurname {

	public static void main(String[] args) {
		String name;
		String surName;
		int spPos ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a name ");
		name = sc.nextLine();
		//Gets the index of the first space
    	spPos = name.indexOf(" ") ;
    	//Gets the surname by making a substring after the first space 
    	surName = name.substring(spPos+1);
    	System.out.println(name) ;
    	
    		
		System.out.println("\n\n\tlastName : >>" + surName + "<<" );

	}

}
