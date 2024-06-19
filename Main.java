import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		
		if(n%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("ODD");
		}
	}
} 