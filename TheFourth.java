public class TheFourth{
	public static void main(String[] args)
	{
		String name = "";

		System.out.print("Enter your name: ");
		name = System.console().readLine();
		System.out.println("length = " + name.length()); /* debug line */

		System.out.println("Hello " + name);
	}
}
