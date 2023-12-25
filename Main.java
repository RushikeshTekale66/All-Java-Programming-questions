import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int factorial=1;
        for(int i=1; i<=n; i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial of Number is: "+ factorial);
    }
}