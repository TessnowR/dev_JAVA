//robert tessnow-ramirez SPC#:2310889 
//January 20, 2016 ©
package tessnowramirez3;

import java.util.Scanner;

public class OddMultipleOf7 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter an odd multple of 7 under 200 ");//prompts user to enter a odd multiple of 17 under 200
		int multiple_of_seventeen = input.nextInt();//gets input from user, assigns to int variable multiple_of_seventeen
		
		if ((multiple_of_seventeen % 2 == 1) && ( multiple_of_seventeen % 17 == 0 ) && ( multiple_of_seventeen < 200))// uses a conditional expression to determine if user input is an odd interger AND (&&) a multiple of 17 AND is under 200
			
			System.out.println("This is acceptable");//prompts user that the interger entered is acceptable
		else
			System.out.println("This is unacceptable");//prompts user that the interger entered is unacceptable
					
		
	}

}
