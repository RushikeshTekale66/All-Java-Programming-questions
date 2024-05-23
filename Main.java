import java.util.ArrayList;
import java.util.Scanner;

// Print array element in reverse order
public class Main {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 6, 7, 8, 9 };
		for(int i=arr.length-1; i>=0; i--){
			System.out.print(arr[i] + " ");
		}	
	}
}