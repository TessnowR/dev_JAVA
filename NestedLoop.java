package tessnowramirez5;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		
		int row,circle;//create integer variables row and circle
		
		 for( row = 1; row <= 7; row++ )//loop 1 creates 7 new lines first row starting at 1 and ending at 7
	        {
			 
			  for( circle = 4; circle <= 10; circle++ )//loop 2 will run 7 times, circle  is equal 4 because of the condition below 
	        {											//loop 2 determines what each line will contain
			 	
	        if(row > 10 - circle)// for each iteration in loop 2 if statement is true then it will print a "o" else false then it will print a space
	                System.out.print( "o" );
	         else
	                System.out.print(" ");
	         }
	            System.out.println();
	         }
	    
		 
		 
		
	}
}
