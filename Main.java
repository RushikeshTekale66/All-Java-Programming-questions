import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        int r = sc.nextInt();
        System.out.println("Area of circle is : " + Math.PI*r*r);
    }
}