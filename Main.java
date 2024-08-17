
class Main
{
	public static void main(String[] args) {
		int [] arr = {1, 10};
		for(int i=0; i<arr.length; i++){
		    for(int j=i+1; j<arr.length; j++){
		        if(arr[i]>arr[j]){
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		    System.out.println(arr[i]);
		}
		
// 		System.out.println(arr[arr.length-1]);
		int count = 0;
		for(int i=arr[0]; i<=arr[arr.length-1]; i++){
		    boolean result = true;
		    for(int j=0; j<arr.length; j++){
		        if(i==arr[j]){
		            result = false;
		        }
		    }
		    if(result){
		        count ++;
		    }
		}
		System.out.println(" Total count " + count);
	}
}
