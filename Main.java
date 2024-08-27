
import java.util.Scanner;
public class Main
{
    
    public static int factorial(int n){
        if(n==0 || n==1) return 1;
        else{
            return n * factorial(n-1);
        }
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number to check the factorial");
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}
}
