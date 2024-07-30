class Main {
	public static void main(String[] args) {
		int n = 10;
		int x = 1;
		int[] arr = new int[n - 1];

		System.out.println("Start");
		try {
			try {
				for (int i = 0; i <= arr.length; i++) {
					try {
						arr[i] = i / x;
					} catch (Exception e) {
						System.out.println("Second try" + e + " " + i);
					}
				}
			} catch (Exception e) {
				System.out.println("First try");
			}

		} catch (Exception e) {
			System.out.println("Final Error" + e);
		}
		System.out.println("End");
	}
}