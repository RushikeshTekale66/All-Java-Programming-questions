import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.nextLine();
		String str2 = "";
		for(int i=0; i< str.length()/2; i++){
			str2 = str2 + str.charAt(i);
		}
		System.err.println(str2);
		
		
	}
}