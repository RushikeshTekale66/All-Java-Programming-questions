import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);

        int age =  sc.nextInt();
        
        if(age>21){
            System.out.println("Berojgar");
        }
        else if(age>18){
            System.out.println("Young");
        }
        else if (age>10){
            System.out.println("Tean ager");
        }
        else if(age>5){
            System.out.println("Child");
        }
        else if(age>=1){
            System.out.println("Baby");
        }
        else{
            System.out.println("New born");
        }
        
	}
}
