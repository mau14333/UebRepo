public class TheSixth{
	public static String[] askname(String first, String last)
	{
		System.out.print("Enter your first name: ");
		first = System.console().readLine();
		System.out.print("Now enter your last name: ");
		last = System.console().readLine();
		return new String[]{first, last};
	}
}