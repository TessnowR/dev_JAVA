//robert tessnow-ramirez SPC#:2310889 
//January 21, 2016 ©
package tessnowramirez3;

import java.util.Scanner;

public class AcmeShirtsWithoutSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final double SHIRT_PRICE = 19.95;//declare a constant SHIRT_PRICE that does not change
		double actual_price;//declare a double variable actual_price, assigns it the value of the actual price the customer will pay after discounts are applied
		
		
		//prompt user to enter quantity purchased status
		
		System.out.print("Enter the quantity of Acme Shirts purchased greater than 0 ");
			int order_quantity = input.nextInt();
			
			if (order_quantity > 0 && order_quantity < 3)
			{
				actual_price = order_quantity * SHIRT_PRICE;
				System.out.print("You ordered " + order_quantity + " Acme Shirts. The total cost is $" + actual_price);
			}
			else if (order_quantity == 3 || order_quantity ==4)
			{
				actual_price = ((SHIRT_PRICE * order_quantity) / 100) * 10;
				System.out.print("You ordered " + order_quantity + " Acme Shirts. The total cost is $" +(float) actual_price);
			}
			else if (order_quantity >= 5 && order_quantity <=7)
			{
				actual_price = ((SHIRT_PRICE * order_quantity) / 100) * 20;
				System.out.print("You ordered " + order_quantity + " Acme Shirts. The total cost is $" + (float) actual_price);
			}
			else if (order_quantity >=8 && order_quantity <= 11)
			{
				actual_price = ((SHIRT_PRICE * order_quantity) / 100) * 30;
				System.out.print("You ordered " + order_quantity + " Acme Shirts. The total cost is $" + (float) actual_price);
			}
			else if (order_quantity >= 12)
			{
				actual_price = ((SHIRT_PRICE * order_quantity) / 100) * 40;
				System.out.print("You ordered " + order_quantity + " Acme Shirts. The total cost is $" + (float) actual_price);
			}
		
		
		
		
		
		
		

	}

}
