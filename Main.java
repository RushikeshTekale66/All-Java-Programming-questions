class Main {
	public static void main(String[] args) {
		System.out.println("Three-digit combinations WITH repetition:");
		generateWithRepetition();

		System.out.println("\nThree-digit combinations WITHOUT repetition:");
		generateWithoutRepetition();
	}

	// Generate combinations with repetition
	public static void generateWithRepetition() {
		int count = 0;
		for (int i = 1; i <= 9; i++) { // First digit (1-9)
			for (int j = 0; j <= 9; j++) { // Second digit (0-9)
				for (int k = 0; k <= 9; k++) { // Third digit (0-9)
					// System.out.println(i + "" + j + "" + k);
					count++;
				}
			}
		}
		System.out.println(count);
	}

	// Generate combinations without repetition
	public static void generateWithoutRepetition() {
		int count = 0;
		for (int i = 1; i <= 9; i++) { // First digit (1-9)
			for (int j = 0; j <= 9; j++) { // Second digit (0-9)
				if (j == i)
					continue; // Ensure no repetition of digits
				for (int k = 0; k <= 9; k++) { // Third digit (0-9)
					if (k == i || k == j)
						continue; // Ensure no repetition of digits
					// System.out.println(i + "" + j + "" + k);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}