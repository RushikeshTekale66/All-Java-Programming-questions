import java.util.Scanner;

public class Main{

	public static void Palindrome(String str){
		int end = str.length()-1;
		int start = 0;
		boolean result = true;
		while(start<end){
			if(str.charAt(start)!=str.charAt(end)){
				result = false;
			}
			start++;
			end--;
		}
		if(result) System.out.println("String is Palindrome");
		else System.out.println("String is not palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.next();

		Main.Palindrome(str);
	}
}