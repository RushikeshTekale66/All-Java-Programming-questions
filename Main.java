import java.util.Scanner;
class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int [] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 1};

		for(int i=arr.length-1; i>=0; i--){
			System.out.println(arr[i]);
		}
	}
}