class Main{
	public static void main(String [] args){
			try {
				int n=100, x=1;
				int [] arr = new int [n];
				for(int i=0; i<=arr.length; i++){
					arr[i] = i/x;

				}
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index of bound "+ e);
			}
			catch(ArithmeticException e){
				System.out.println("Arithmetic " + e);
			}
			catch(Exception e){
				System.out.println("Exception " + e);
			}
	}
}