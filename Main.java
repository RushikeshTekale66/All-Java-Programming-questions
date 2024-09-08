class Main{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5, 6, 7, 8, 9 };
        int target = 7;

        int left = 0;
        int right = arr.length -1 ;

        boolean result = false;

        while(left<right){
            int mid = (left+right)/2;

            if(target == arr[mid]) result = true;

            if(target<arr[mid]){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }

        if(result){
            System.out.println("Target is present in array");
        }
        else{
            System.out.println("Target is not present in array");
        }
    }
}