import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("First String");
		// return the full input of string
		String str = sc.nextLine();

		System.out.println("Second String");
		// return only first word ie. till the saparator
		String str2 = sc.next();
		
		System.out.println(str+" first & second is " + str2);
		
		
	}
}