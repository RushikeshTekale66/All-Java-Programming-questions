class Main {
	public static void main(String[] args) {
		// 1-d array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int add1 = 0;

		for (int i = 0; i < arr.length; i++) {
			add1 += arr[i];
		}
		System.out.println("Addition of all 1-d array element " + add1);

		// 2-d array
		int[][] arr2 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int add2 = 0;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				add2 += arr2[i][j];
			}
		}
		System.out.println("Addtion of all 2 d element " + add2);
	}
}