/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int n=10, firstNumber = 0, secondNumber = 1;
        for(int i=2; i<n; i++){
            System.out.print(firstNumber + ", ");
            int nextNumber = firstNumber + secondNumber;
            secondNumber = firstNumber;
            firstNumber = nextNumber;
        }
    }
}