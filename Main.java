public class Main{

	public static int fibonachiNumber(int n){
		if(n<=1) return n;
		return fibonachiNumber(n-1)+fibonachiNumber(n-2);
	}
	public static void main(String[] args) {
		System.out.println(Main.fibonachiNumber(3));
	}
}