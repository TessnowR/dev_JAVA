//robert tessnow-ramirez SPC#:2310889 
//January 16, 2016 ©

package tessnowramirez1and2;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//Creates a new Scanner Object

		// Pythagorean theorem a^2 + b^2 = c^2 
		
		System.out.print("Enter length of side 1 of the right triangle: ");//prompts user to enter one side of the right triangle
		int leg1 = input.nextInt();// creates a int variable named leg1, assigns it the value of users input
		
		System.out.print("Enter length of side 2 of the right triangle: ");//prompts user to enter the other side of the right triangle
		int leg2 = input.nextInt();//creates a int variable named leg 2, assigns it the value of users input
		
		double hypotenuse = Math.pow(leg1,2) + Math.pow(leg2, 2);// uses the pythagorean theorem  to calculate the hypotenuse
		 
		System.out.print("The length of the hypotenuse is " + Math.sqrt(hypotenuse));//print the length of the hypotenuse by taking the square root of the hypotenuse
	}

}
