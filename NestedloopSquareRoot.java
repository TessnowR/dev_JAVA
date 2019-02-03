//robert tessnow-ramirez SPC#:2310889 
//January 23, 2016 ©
package tessnowramirez5;

public class NestedloopSquareRoot {

	public static void main(String[] args) {
		
		double row;
		
		System.out.printf("%-10s%-10s%-10s","N","Sq Root", "Cube Root\n");//formats string titles 10 spaces apart
		
		for(row = 0; row<= 100; row += 5)//creates a loop that creates 100 lines the variable row in created in increments of 5
		{
			double square_root = Math.sqrt(row);//calculates the value of square_root
			double cube_root = Math.cbrt(row);//calculates the value of cube_root
			System.out.printf( "%-10.1f%-10.5f%-10.5f\n", row ,square_root, cube_root);//formats output 10 spaces each on a new line.
			
		}
			
		
			
			
		
	}

}
