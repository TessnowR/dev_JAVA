//robert tessnow-ramirez SPC#:2310889 
//January 20, 2016 ©
package tessnowramirez3;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class AcmeShirts {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double SHIRT_PRICE = 19.95;//declare a constant SHIRT_PRICE that does not change
		double actual_price;//declare a double variable actual_price, assigns it the value of the actual price the customer will pay after discounts are applied
		
		
		
		//prompt user to enter quantity purchased status
		System.out.print("Enter 0-for quanity purhase is from 0-2,\n"
				+ "Enter 1-for quanity purchased is from 3 or 4,\n"
				+ "Enter 2-for quanity purchase is from 5-7,\n"
				+ "Enter 3-for quantity purchase is from 8-11,\n"
				+ "Enter 4-for quantity purchase is 12 or more ");
		int status = input.nextInt();// catches users input, assigns to int value status
		
		//prompt user to enter the exact order quantity
		System.out.print("Enter the order quantity: ");
		int order_quantity = input.nextInt();//catches users input ,assigns to int variable order_quantity
		
		switch (status){
		case 0: actual_price = order_quantity * SHIRT_PRICE;
				System.out.println("You ordered " + order_quantity + " Acme Shirts. The total cost is $" + actual_price); break;
		case 1: actual_price = ((SHIRT_PRICE * order_quantity) / 100) * 10;
				System.out.println("You ordered " + order_quantity + " Acme Shirts. The total cost is $" +  (float) actual_price); break;
		case 2: actual_price = ((SHIRT_PRICE * order_quantity) / 100) * 20;
				System.out.println("You ordered " + order_quantity + " Acme Shirts. The total cost is $" +  (float) actual_price); break;
		case 3: actual_price = ((SHIRT_PRICE * order_quantity) / 100) * 30;
				System.out.println("You ordered " + order_quantity + " Acme Shirts. The total cost is $" +  (float) actual_price); break;
		case 4: actual_price = ((SHIRT_PRICE * order_quantity) / 100) * 40;
				System.out.println("You ordered " + order_quantity + " Acme Shirts. The total cost is $" +  (float) actual_price); break;
		}
		
		
		
		
		
		

	}

}
