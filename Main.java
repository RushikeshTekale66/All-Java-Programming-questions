public class Main {

	public static void main(String[] args) {
		String str = "Rushikesh Tekale";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >='a' && ch <= 'z') {
				count++;
			}
		}
		System.out.println(count);
	}
}