import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "Rushikesh";
		int length = str.length();
		String str2 ="";
		for(int i=length-1; i>=length/2; i--){
			str2 = str2+str.charAt(i);
		}
		System.out.println(str2);
	}
} 