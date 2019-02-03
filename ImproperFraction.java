//robert tessnow-ramirez SPC#:2310889 
//January 16, 2016 ©

package tessnowramirez1and2;

import java.util.Scanner;

public class ImproperFraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//Creates a new Scanner Object
		
		System.out.print("Enter numerator: ");// prompts the user to enter a numerator
		int numerator = input.nextInt();//creates a int variable named numerator, assigns it the value of user input
		
		System.out.print("Enter denominator: ");//prompts the user to enter a denominator
		int denominator = input.nextInt();//creates a int variable named numerator, assigns it the value of user input
		
		int whole_number = numerator / denominator;// creats a int variable whole_number, assigns it the value of the whole number of the mixed fraction by dividing the numerator by the denominator
		int fraction_numerator = numerator % denominator;//creates a int variable fraction_numerator, assigns it the value of the remainder of the numerator divided by the denominator
		
		System.out.print("The mixed number is " + whole_number + 
				" and " + fraction_numerator + "/" + denominator);

		
	}

}
