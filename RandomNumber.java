//robert tessnow-ramirez SPC#:2310889 
//January 20, 2016 ©
package tessnowramirez3;

public class RandomNumber {

	public static void main(String[] args) {
		
		int num = 1 + (int) (Math.random() * 12);//generate a random number between 1 and 12 inclusive
		
		if (num > 7)//Multi-Way if - else statement used to calculate whether random interger num is over 7
			System.out.println("The random number is " + num + " the number is over 7.");//displays the random interger that was generated and informs whether the random interger is over 7
		else
			if (num < 7)//Multi-Way if - else statement used to calculate whether random interger num is under 7
				System.out.println("The random number is " + num + " the number is under 7.");//displays the random interger that was generated and informs whether the random interger is under 7
			else
				if (num == 7)
					System.out.println("The random number is " + num + " the number is equal to 7.");//displays random interger that was generated and informs user whether the random interger is equal to 7
				
	}

}
