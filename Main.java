/**
 * Main
 */
public class Main {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("1 ****************");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("2 ****************");
		int count = n;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(count);
			}
			count--;
			System.out.println();
		}

		System.out.println("3 ****************");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("4 ****************");
		for(int i=1; i<=n; i++){
			int count2 = i;
			for(int j=1; j<=i; j++){
				System.out.print(count2);
				count2--;
			}
			System.out.println();
		}

		System.out.println("5 ****************");
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(n-j+1);
			}
			System.out.println();
		}

		System.out.println("6 ****************");
		for(int i=n; i>=1; i--){
			for(int j=i; j<=n; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
1 ****************
1
22
333
4444
55555
2 ****************
5
44
333
2222
11111
3 ****************
1
12
123
1234
12345
4 ****************
1
21
321
4321
54321
5 ****************
5
54
543
5432
54321
6 ****************
5
45
345
2345
12345
 */