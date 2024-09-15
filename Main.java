import java.util.Scanner;

class Main {

    public void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Display the sorted array
    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Enter the elements to the array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // object of sort
        Main m = new Main();
        m.insertionsort(arr);

        System.out.println("Sorted Array is");
        m.display(arr);
    }
}