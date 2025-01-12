import java.util.Scanner;
class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string to reverse");
		String str = sc.nextLine();
		String str2 = "";

		for(int i=str.length()-1; i>=0; i--){
			System.out.print(str.charAt(i));
			str2 = str2+str.charAt(i);
		}
		System.out.println("\n" + str2);
	}
}