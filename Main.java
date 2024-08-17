import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int fC = 100;
        int oC = 100;
        int tC = 100;
        int fiC = 100;

        int fiftyCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        int fiveCount = 0;

        System.out.println("Please enter amount multiple of 50, 100, 200, 500");
        System.out.println("Enter amount to withdraw");
        int amount = sc.nextInt();

        if (amount % 50 == 0 || amount % 100 == 0 || amount % 200 == 0 || amount % 500 == 0) {
            while (amount >= 500) {
                amount = amount - 500;
                fiC--;
                fiveCount++;
            }

            while (amount >= 200) {
                amount = amount - 200;
                tC--;
                twoCount++;

            }

            while (amount >= 100) {
                amount = amount - 100;
                oC--;
                oneCount++;
            }

            while (amount >= 50) {
                amount = amount - 50;
                fC--;
                fiftyCount++;
            }
        }
        else{
            System.out.println("Please enter correct amount");
        }

        System.out.println("Total remaining Fifty Amount : " + (fC * 50));
        System.out.println("Total remaining Two Hundread Notes : " + (tC * 200));
        System.out.println("Total remaining Hundread Notes : " + (oC * 100));
        System.out.println("Total remaining Five Hundread Notes : " + (fiC * 500));

        System.out.println();
        System.out.println("Total 500 Notes pickup : " + fiveCount);
        System.out.println("Total 200 Notes pickup : " + twoCount);
        System.out.println("Total 100 Notes pickup : " + oneCount);
        System.out.println("Total 50 Notes pickup : " + fiftyCount);

    }
}