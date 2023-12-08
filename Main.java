import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int Doublenumber = a<<1;
        System.out.println("Double of number is: " + Doublenumber);
    }
}