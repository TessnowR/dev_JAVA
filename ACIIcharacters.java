//robert tessnow-ramirez SPC#:2310889 
//January 27, 2016 ©
package tessnowramirez5;

public class ACIIcharacters {

	public static void main(String[] args) {
		
			
		
		
		char asciiCharacter = 33;//create char variable asciiCharacter, assign it the value 33
		int counter = 1;// create a integer counter, assigns it the value of 1

		while (asciiCharacter <= 126)//create awhile loop to continue as long as asciiCharacter is less than or equal to  126
		{
			System.out.print(asciiCharacter + "  ");//if true asciiCharacter is printed with 2 spaces
			asciiCharacter++;//asciiCharacter is incremented by 1
			counter++; //counter is incremented by 1
			
			if( counter % 20 == 1)//each increment of counter is calculated,if expression is equal to 0 it will print a new line
			{
				System.out.println();
			}
		}
				
				 
			 
			 

		
		
			 }			 
}
