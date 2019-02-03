//robert tessnow-ramirez SPC#:2310889 
//January 16, 2016 ©
package tessnowramirez1and2;

import java.util.Scanner;

public class RoadTrip {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//Creates a new Scanner Object
		
		System.out.print("Enter miles covered: "); //Prompts user to enter miles covered
		 int miles_covered = input.nextInt();// Creates an int variable named miles_covered
		
		 System.out.print("Enter amount of gas consumed: ");// prompts user to enter the amount of gas that user has used
		 int gas_consumed = input.nextInt();//Creates an int variable named gas_consumed
		 
		 double milage = miles_covered / gas_consumed;// creates a int variable named mileage, assigns it the value of mileage_consumed divided by gas_covered
		 
		 System.out.print("The milage is " + milage + " miles per gallon");// prints the mileage in miles per gallon
		 
		

	}

}
