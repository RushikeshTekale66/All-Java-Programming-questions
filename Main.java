import java.util.Scanner;
class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Line 1");
		String str1 = sc.nextLine();
		System.out.println("Line 2");
		String str2 = sc.next();

		System.out.println(str1);
		System.out.println(str2);
	}
}