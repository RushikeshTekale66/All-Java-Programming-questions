public class Main{

	public static void fibonachiNumber(int n){
		int n1 =1, n2 = 1;

		System.out.print(n1+ ", "+n2);

		for(int i=2; i<n; i++){
			int sum = n1+n2;
			System.out.print(", "+sum);
			n1=n2;
			n2=sum;
		}
	}
	public static void main(String[] args) {
		Main.fibonachiNumber(10);
	}
}