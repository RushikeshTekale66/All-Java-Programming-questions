import java.util.Scanner;

// find the array type wether it is even || odd || mix type

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the next integer");
            arr[i] = sc.nextInt();
        }

        int oddcount = 0;
        int evencount = 0;
        int mixcount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else if (arr[i] % 2 != 0) {
                oddcount++;
            } else {
                mixcount++;
            }
        }

        System.out.println("Evencount "+evencount + "\nOddcount " + oddcount + "\nMixcount " + mixcount);

        if (evencount == n)
            System.out.println("Array is of even type");
        else if (oddcount == n)
            System.out.println("Array is of odd type");
        else
            System.out.println("Array is of mix type");

    }

}
