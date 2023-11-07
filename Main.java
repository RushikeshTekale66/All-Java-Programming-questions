import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height");
        int h = sc.nextInt();
        System.out.println("Enter Base");
        int b = sc.nextInt();
        System.out.println("Area of Triangle is : " + h*b);
    }
}