import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int [] arr = {1, 2, 3, 5, 6, 6, 7, 9};

        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max element is : " + max);
    }
}