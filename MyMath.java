package tessnowramirez6;

import java.util.Scanner;

public class MyMath {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two double numbers");//prompt user to enter to double values
		double number1 = input.nextDouble();//initialize double variable number 1, assign it the value of users input
		double number2 = input.nextDouble();//initialize double variable number 2, assign it the value of users second input
		totaldiff(number1,number2);//calls the totaldiff method, passes variable number1 and number2
		
		double product = product(number1,number2);//initializes double variable product, assigns it the value that is caught by the return value sent from the product method
		System.out.println(number1 + " times " + number2 + " = " +  product);// output users input after multiplied
		
		double quotient = quotient(number1,number2);//initialize double variable quotient, assign it the return value from method quotient
		System.out.printf("%.3f%s%.3f%s%.3f",number2 , " divided by " , number1 , " = " , quotient);//outputs formated quotient of users input
		input.close();
	}
	public static void totaldiff(double parameter1, double parameter2){//creates a void totaldiff method, definition calculates the total of users inputs and prints out the total and the positive difference.
	System.out.println("The total of " + parameter1 + " and " + parameter2 + " is " + (parameter1 + parameter2) );
	double difference = parameter1 - parameter2;//initializes double variable difference, assigns it the value of users inputs subtracted
	if (difference < 0 ){//if statements determines if difference is a negative number and if true changes it to a positive value
		System.out.println("The positive difference between "+ parameter2 + " and " + parameter1 + " is " + -difference);
	}else{
			System.out.println("The positive difference between "+ parameter1 + " and " + parameter2 + " is " + difference);
			}
	}
	public static double product( double parameter1, double parameter2){// creates a value returning method called product, definition calculates the product of users input and returns the product.
		return parameter1 * parameter2;	
	}
	public static double quotient( double parameter1, double parameter2){
		if (parameter1 < parameter2 ){
			return parameter2 / parameter1;
		}
		else{
		return parameter1 / parameter2;
		}
		
	}
}
