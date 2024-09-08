class Main{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 5, 6, 7, 8, 9 };
        int target = 7;

        boolean result = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                result = true;
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