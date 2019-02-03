//robert tessnow-ramirez SPC#:2310889 
//January 21, 2016 ©
package tessnowramirez4;

public class Triangle {

	public static void main(String[] args) {
				
		double hypotenuse = 10, opposite, adjacent = 8, opposite1;
		double angle_A, angle_B, angle_C = 90;
		
		opposite1 = (Math.pow(hypotenuse, 2)) - (Math.pow(adjacent, 2));
		opposite = Math.sqrt(opposite1);
		
		angle_A = Math.toDegrees(Math.acos(adjacent / hypotenuse));
		angle_B = Math.toDegrees(Math.asin( adjacent / hypotenuse));
		
		System.out.printf("the angle of A is " + "%.3f",angle_A);
		
		System.out.printf("\nThe angle of B is " + "%.3f", angle_B);

		
		
		System.out.printf("\nThe value of sida a is " + "%.3f", opposite);
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
