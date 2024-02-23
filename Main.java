import java.util.Scanner;

// find Sum of numbers in a given range

class Main {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting number");
        int a = sc.nextInt();
        
        System.out.println("Enter ending number");
        int b = sc.nextInt();

        int sum =0;
        for (int i=a; i<=b; i++){
            sum = sum + i;
        }
        
        System.out.println(sum);
        
    }

}
