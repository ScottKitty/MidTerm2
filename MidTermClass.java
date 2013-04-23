import java.util.Scanner;
public class MidTermClass
{
	private int LoBound;
	private int HiBound;
	static public int Random;
	static public int number;
	
	public MidTermClass()
	{
		LoBound = 1;
		HiBound = 6;
	}
	public MidTermClass(int Low, int High)
	{
		LoBound = Low;
		HiBound = High;
	}
	public int RandomNumber()
	{
		Random = LoBound + (int) (Math.random() * HiBound);
		return Random;
	}
	static void UserMessege()
	{
		Scanner input = new Scanner(System.in);
		System.out.printf( "Enter a number 1-3 for Low and 4-6 for High ");
		number = input.nextInt();
	}
	static void CheckWinner()
	  	{
	  		
			if ( (Random >= 4) && (number >= 4) )
	  			{
	  				System.out.println("You Win, Both High");
	  				System.out.printf("Dice was %d", Random);
	  				
	  			}
	  		else if ( (Random <= 3) && (number <= 3) )
	  			{
	  				System.out.println("You Win, Both Low");
	  				System.out.printf("Dice was %d", Random);
	  				
	  			}
	  		else 
	  			{
	  				System.out.println("You Lose");
	  				System.out.printf("Dice was %d", Random);
	  			}
	  	}
	static void UserMessege2()
	{
		Scanner input = new Scanner(System.in);
		System.out.printf( "Enter a number 1-6 for Low and 7-12 for High");
		number = input.nextInt();
	}
	
	static void CheckWinner2()
  	{
  		
		if ( (Random >= 7) && (number >= 7) )
  			{
  				System.out.println("You Win, Both High");
  				System.out.printf("Dice were %d", Random);
  				
  			}
  		else if ( (Random <= 6) && (number <= 6) )
  			{
  				System.out.println("You Win, Both Low");
  				System.out.printf("Dice were %d", Random);
  				
  			}
  		else 
  			{
  				System.out.println("You Lose");
  				System.out.printf("Dice were %d", Random);
  			}
  	}
}
	
	
	
	
	
	
	
	
