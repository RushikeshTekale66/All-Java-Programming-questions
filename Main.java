import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total lit petrol");
		double Totalfuel = sc.nextDouble();

		System.out.println("Total price of petrol filled");
		double totalfilledfuelprice = sc.nextDouble();

		System.out.println("Current Reading");
		double currentkm = sc.nextInt();

		System.out.println("Previous Reading");
		double prevkm = sc.nextInt();

		double fuelperlit = totalfilledfuelprice/Totalfuel;
		double avg =  (currentkm-prevkm)/Totalfuel;
		double cost = fuelperlit /avg;
        
		System.out.println("Average of Bike "+ avg);
		System.out.println("Cost per km "+ cost);
	}
}