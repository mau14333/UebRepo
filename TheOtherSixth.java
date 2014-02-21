public class TheOtherSixth{
	public static void main(String[] args)
	{
		String first = "";
		String last = "";
		String[] retValue;

		retValue = TheSixth.askname(first, last);

		first = retValue[0];
		last = retValue[1];
		
		System.out.println("Hello " + first + " " + last);
	}
}
