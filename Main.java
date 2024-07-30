class Main {
	public static void main(String[] args) {
		// 1-d array
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr11 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] result1 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			result1[i] = arr1[i] * arr11[i];
		}
		for (int i = 0; i < result1.length; i++) {
			System.out.print(" " + result1[i]);
		}
		System.out.println();

		// 2-d array
		int[][] arr2 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] arr22 = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		
		int [][] result2 = new int[arr2.length][arr2.length];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				result2[i][j] = arr2[i][j] + arr22[i][j];
			}
		}
		for(int i=0; i<result2.length; i++){
			for(int j=0; j<result2.length; j++){
				System.out.print(" " + result2[i][j]);
			}
			System.out.println();
		}
	}
}