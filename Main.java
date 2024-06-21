import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "Rushikesh";
		String str2 ="";
		for(int i=str.length()-1; i>=0; i--){
			str2 = str2+str.charAt(i);
		}
		System.out.println(str2);
	}
} 