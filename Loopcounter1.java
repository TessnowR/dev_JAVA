//robert tessnow-ramirez SPC#:2310889 
//January 23, 2016 ©
package tessnowramirez5;

import java.util.Scanner;

public class Loopcounter1 {

	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner (System.in);// Create a Scanner
		// Read an initial data
		System.out.print("Enter a number or 0 to quit: ");
		int num = input.nextInt();//assign user input to integer variable num.
		
		// Keep reading data until the input is 0
		int sum = 0;
		int accumulator = 0;
		
		
		while (num != 0)//while loop while true
		{
			sum += num;//sum = sum + num
			//read the next data
			System.out.print("Enter a number or 0 to quit: ");
			num = input.nextInt();
			accumulator++;
		}
		
		
		float mean = (float)sum / accumulator;//calculates to mean of users inputs
			
		System.out.printf("The total of those " + accumulator + " numbers is " + sum + "." + "\nThe average is " + "%.3f", mean);
		System.out.println(".");
		input.close();
			
		
	}

}
