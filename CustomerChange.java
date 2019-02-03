//robert tessnow-ramirez SPC#:2310889 
//January 16, 2016 ©
package tessnowramirez1and2;

import java.util.Scanner;

public class CustomerChange {

	public static void main(String[] args) {
		// customer pays with a $100 bill
		
		Scanner input = new Scanner(System.in);// Creates a new Scanner Object
	
		final int TOTAL = 100;// creates a Constant int named TOTAL, assigned the value of 100

		System.out.print("Enter the purchase price in dollars: ");//prompts user to enter the purchase price in dollars
		int purchasePrice = input.nextInt();// creates a int variable named purchasePrice, assigns it the value of users input

		int totalChange = TOTAL - purchasePrice;//creates in variable totalChange, assigns it the value of TOTAL minus purchasePrice

		int twenty = totalChange / 20;// creates int variable twenty, assigns it the value of totalChange divided by 20

		int ten = (totalChange % 20) / 10;// creates int variable ten, assigns it the value remainder of totalChange divided by 20 then divided by 10

		int five = (totalChange % 10) / 5;// creates int variable five, assigns it the value  remainder of totalChange divided by 10 then divided by 5

		int ones = (totalChange % 5) / 1;

		System.out.println("Your change is " + totalChange + " dollars as follows:");
		System.out.print(twenty + " twenties, " + ten + " ten, " + five + " five, and " + ones + " ones.");

	}

}
