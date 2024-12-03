import java.util.Scanner;

public class Main{

	public static void swap(int a, int b){
		a = a+b;
		b=a-b;
		a=a-b;

		System.out.println("Values of after swaping is : a = "+ a + " & b = " +b );
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number a");
		int a = sc.nextInt();

		System.out.println("Enter second number b");
		int b = sc.nextInt();

		Main.swap(a, b);


	}
}