class Main{
    public static void main(String [] args){
        int[] arr= {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int k=2;

        for(int i=0; i<k; i++){
            int first = arr[0], j;
            for(j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }

        // Display array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}