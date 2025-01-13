public class Main {

	public static void main(String[] args) {
		int number = 15;

		//Least significant digit
		int lsd = number%10;

		//Most significant digit
		int msd = number;
		while(msd>=10){
			msd/=10;
		}

		System.err.println("LSD : " + lsd);
		System.out.println("MSD : " + msd);
	}
}