import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int digits[ ] = {1, 2, 3};
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) { // Ensure unique digits
                        System.out.println("" + digits[i] + digits[j] + digits[k]);
                    }
                }
            }
        }
    }
}
