import java.util.Scanner;

class Main {

    public void selectionsort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
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

        // object of bubble sort
        Main m = new Main();
        m.selectionsort(arr);

        System.out.println("Sorted Array is");
        m.display(arr);
    }
}