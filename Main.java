class Main{
	public static void main(String [] args){
		int a=10;
		int b=0;
		int c=0;

		System.out.println("Start");
		try{
			c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("Got error" + e);
		}
		System.out.println("End");
	}
}