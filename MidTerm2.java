public class MidTerm2
{
	public static void main(String[] args)
	{
		MidTermClass RandomNumber1 = new MidTermClass();
		MidTermClass RandomNumber2 = new MidTermClass(1,12);

		
		RandomNumber1.RandomNumber();
		MidTermClass.UserMessege();
		MidTermClass.CheckWinner();
		
		RandomNumber2.RandomNumber();
		MidTermClass.UserMessege2();
		MidTermClass.CheckWinner2();
	}
}