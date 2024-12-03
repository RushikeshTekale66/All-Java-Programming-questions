import java.util.Scanner;

public class Main{

	public static void Reverse(String str){
		int length = str.length()-1;
		while(length>=0){
			System.out.println(str.charAt(length));
			length--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.next();

		Main.Reverse(str);
	}
}