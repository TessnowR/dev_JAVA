package tessnowramirez6;

import java.util.Scanner;

public class BackwardsNameMethod {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter your name, please");//prompts user to input name
		String name = input.nextLine();//initiates String variable name, assigns it the value user inputs
		int length = stringer(name);//initializes integer length, calls the stringer method passing variable name as its sole argument, assigns it the value of stringer method return value
		System.out.println("Your name has "  + length + " Characters");//prompts users name length
		
	}
	public static int stringer(String parameter1){//initializes a integer value returning method name stringer that accepts a String parameter, definition is it prints out users name in reverse order and returns its character length
		int length = parameter1.length();	//initializes integer variable length, assigns it the length of users name	
		String reverse = "";// initializes String variable reverses, assigns it an empty string. 		
		for ( int iterations = length - 1; iterations >= 0; iterations--){//for loop used to gets users name backwards
			reverse = reverse + parameter1.charAt(iterations);//String variable reverse, assigned the value of users name backwards 1 character at a until loop is finished
			}System.out.println("Your name backwards is " + reverse);//prints users name backwards after loop has finished
			
		return  parameter1.length();//returns the length of name to the Main Method
}
}
