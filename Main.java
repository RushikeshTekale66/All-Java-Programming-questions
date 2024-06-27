/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		int n=5; 

		System.out.println("1 *********************");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print((char)(i+64));
			}
			System.out.println();
		}

		System.out.println("2 *********************");
		for(int i=n; i>=1; i--){
			for(int j=i; j<=n; j++){
				System.out.print((char)(i+96));
			}
			System.out.println();
		}

		System.out.println("3 *********************");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
		
		System.out.println("4 *********************");
		for(int i=1; i<=n; i++){
			for(int j=i; j>=1; j--){
				System.out.print((char)(j+96));
			}
			System.out.println();
		}

		System.out.println("5 *********************");
		for(int i=n; i>=1; i--){
			for(int j=n; j>=i; j--){
				System.out.print((char)(j+64));
			}
			System.out.println();
		}

		System.out.println("6 *********************");
		for(int i=n; i>=1; i--){
			for(int j=i; j<=n; j++){
				System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}
}

/*
 1 *********************
A
BB
CCC
DDDD
EEEEE
2 *********************
e
dd
ccc
bbbb
aaaaa
3 *********************
A
AB
ABC
ABCD
ABCDE
4 *********************
a
ba
cba
dcba
edcba
5 *********************
E
ED
EDC
EDCB
EDCBA
6 *********************
e
de
cde
bcde
abcde
 */