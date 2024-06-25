import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,7};

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number to add in the array element : ");
		int number = sc.nextInt();

		System.out.println("Array before adding element : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+", ");
		}

		System.out.println("\nArray after adding element : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+number +", ");
		}
	}
} 