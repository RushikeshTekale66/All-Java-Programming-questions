import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        
        System.out.println("Values of A & B before swaping is : a="+ a + ", b="+b);

        a = a+b;
        b=a-b;
        a = a-b;
        System.out.println("Values of A & B after swaping is : a="+ a + ", b="+ b);

    }
}