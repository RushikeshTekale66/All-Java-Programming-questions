class Main{
	public static void main(String [] args){
		int n=100;
		
		int [] arr = new int[n];
		
		int x=1;

		System.out.println("Start");

		try{
			for(int i=0; i<=arr.length; i++){
				arr[i] = i/x;
			}
		}
		catch(ArithmeticException e){
			//if x=0
			System.out.println("Got error" + e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			//if i<=arr.length
			System.out.println("Got error " + e);
		}
		catch(Exception e ){
			//if got another error
			System.out.println("Got Error " + e);
		}
		System.out.println("End");
	}
}