import java.util.ArrayList;
import java.util.Scanner;

// Max occuring number in array & its count
public class Main {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 6, 7, 8, 9 };
		int maxele = 0;
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			System.out.println("Occurance of element  "+ arr[i] + " is "+count);
		}
	}
}