import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int [] arr = {1, 2, 3, 5, 6, 6, 7, 9};

        System.out.println("Enter the element to find out in Array : ");
        int target = sc.nextInt();
        
        boolean result = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                result = true;
            }
        }

        if(result) System.out.println("Element is present in array");
        else System.out.println("Element is not present in array");
    }
}