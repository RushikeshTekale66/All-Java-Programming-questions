/**
 * Main
 */
public class Main {
    public void rotate(int [] arr, int k){
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    public void reverse(int [] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String [] args){
        int [] arr = {1, 2, 3, 4, 5};
        int k = 2;

        Main m = new Main();
        m.rotate(arr, k);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}