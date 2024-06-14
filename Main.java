import java.util.ArrayList;
import java.util.Scanner;

// Print array element 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number whose table you want");
		int n = sc.nextInt();
		System.out.println("Table is : ");
		for(int i=1; i<=10; i++){
			System.out.println(i*n); 
		}	
	}
} 