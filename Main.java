import java.util.Scanner;

class Main{

    public void bubblesort(int[] arr){
        boolean swaped = false;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                System.out.println("Array is already sorted");
                break;
            }
        }
    }

    //Display the sorted array
    public void display(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +  ", ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int [] arr = new int[size];

        //Enter the elements to the array
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //object of bubble sort
        Main m = new Main();
        m.bubblesort(arr);

        System.out.println("Sorted Array is");
        m.display(arr);
    }
}