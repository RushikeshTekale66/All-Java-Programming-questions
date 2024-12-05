import java.util.Scanner;

class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}

		int max = 0;
		for(int i=0; i<size; i++){
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
	}
}