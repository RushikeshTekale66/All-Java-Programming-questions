public class Main {
    public static void main(String[] args) {
        String str = "olleh dlrow";
        System.out.println("Original String: " + str);

        String result = reverseEachWord(str);
        System.out.println("Reversed Each Word: " + result);
    }

    public static String reverseEachWord(String str) {
        String result = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if (current == ' ') {
                // Reverse the current word and append it to the result
                result += reverseWord(word) + " ";
                word = ""; // Reset word
            } else {
                word += current; // Build the current word
            }
        }

        // Reverse and append the last word (if any)
        if (!word.isEmpty()) {
            result += reverseWord(word);
        }

        return result.trim(); // Remove trailing space if any
    }

    // Helper method to reverse a word
    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
