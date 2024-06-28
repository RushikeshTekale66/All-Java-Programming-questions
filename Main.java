class Main {
	public static void main(String[] args) {
		int n = 5;

		// Descending trangle number pattern 1
		/*
		 *************************************
		 * 11111
		 * 2222
		 * 333
		 * 44
		 * 5
		 *************************************
		 */
		System.out.println("*************************************");
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// Descending trangle number pattern 2
		/*
		 *************************************
		 * 55555
		 * 4444
		 * 333
		 * 22
		 * 1
		 *************************************
		 */
		System.out.println("*************************************");
		int count = n;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(count);
			}
			System.out.println();
			count--;
		}

		// Descending trangle number pattern 3
		/*
		 *************************************
		 * 12345
		 * 1234
		 * 123
		 * 12
		 * 1
		 *************************************
		 */
		System.out.println("*************************************");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

		// Descending trangle number pattern 4

		/*
		 *************************************
		 * 12345
		 * 2345
		 * 345
		 * 45
		 * 5
		 *************************************
		 */

		System.out.println("*************************************");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

		// Descending trangle number pattern 5
		/*
		 *************************************
		 * 54321
		 * 5432
		 * 543
		 * 54
		 * 5
		 *************************************
		 */
		System.out.println("*************************************");
		for (int i = 1; i <= n; i++) {
			int count5 = 5;
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print(count5);
				count5--;
			}
			System.out.println();
		}

		// Descending trangle number pattern 6
		/*
		 *************************************
		 * 54321
		 * 4321
		 * 321
		 * 21
		 * 1
		 */
		System.out.println("*************************************");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = n - i + 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}