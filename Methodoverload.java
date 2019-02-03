package tessnowramirez6;

import java.util.Scanner;

public class Methodoverload {

	public static void main(String[] args) {
		
total(5,5);
total(5,5,5);
total(5.0,5);


	}
public static void total(int parameter1, int parameter2){
	System.out.println("The total is: " + (parameter1 + parameter2));
}
public static void total( int parameter1, int parameter2, int parameter3){
	System.out.println("The total is: " + (parameter1 + parameter2 + parameter3));
}
public static void total(double parameter1, int parameter2){
	System.out.println("The total is: " + (parameter1 + parameter2));
}

}
