class Main{
    public static void main(String [] args){
		//1-d array
        int [] arr= {1,2,3,4,5,6,7,8,9,10};
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
		System.out.println();
       
		//2-d array
        int[][] arr2 = {{1,2,3},{1,2,3},{1,2,3}};
        
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2.length; j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }
}