import java.util.Scanner;

public class Main{

	public static void Even(int a){
		if(a%2==0){
			System.out.println("The number is even");
		}
		else{
			System.out.println("The number is Odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = sc.nextInt();

		Main.Even(a);


	}
}