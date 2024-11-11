class Main {
    public static void main(String[] args) {
        int[] arr = { 10, 10, 2, 3, 4, 5, 6, 7, 7 ,7};

        int max =0;
        int element = arr[0];
        for(int i=0; i<arr.length; i++){
            int count =0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(max<count){
                max+=count;
                element = arr[i];
            }
        }
        System.out.println("Max occurence of element is : " + element + " & count is : " + max);
    }
}