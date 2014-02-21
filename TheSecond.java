public class TheSecond{
	public static void main(String[] args)
	{
		String first;
		String last;

		System.out.print("Enter your first name: ");
		first = System.console().readLine();

		System.out.print("Now enter your last name: ");
		last = System.console().readLine();
		
		System.out.println("Hello " + first + " " + last + "!");
	}
}