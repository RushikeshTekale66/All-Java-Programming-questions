class Main{
	public static void main(String [] args){
		try{
			System.out.println("I am try block");
		}
		catch(Exception exception){
			System.out.println(exception);
		}
		finally{
			System.out.println("Finally");
		}
	}
}