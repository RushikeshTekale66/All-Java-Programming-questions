import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of number");
        int n = sc.nextInt();
        System.out.print("Even numbers are : ");
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print(i+", ");
            }
        }
    }
}