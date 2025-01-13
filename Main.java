class Main{
	public static void main(String[] args) {
		int a =10;
		int b =20;
		System.out.println("Value of a & b before swapring a : " + a + " b : "+b);

		a =a+b;
		b=a-b;
		a=a-b;

		System.out.println("Value of a & b After swapring a : " + a + " b : "+b);

	}
	
}