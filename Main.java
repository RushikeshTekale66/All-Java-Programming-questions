import java.util.Scanner;

class Main{
    public static void main(String [] args){
       int [] arr = {9,8,7,6,200,4,100,2,1,10};
       int n = arr.length;
       for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                    // if(arr[j]<arr[i]){
                    //     int temp = arr[i];
                    //     arr[j]=arr[i];
                    //     arr[i]=temp;
                    // }
                    if(arr[i]<arr[j]){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
            }
       }
       for(int i=0; i<n; i++){
        System.out.println(arr[i]);
       }
    }
}
