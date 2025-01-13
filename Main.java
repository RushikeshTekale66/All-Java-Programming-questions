class Main{
	public static void main(String [] args){
		int number = 103; // 153, 9474, 123

		if(isArmstrong(number)){
			System.out.println(number + " is an Armstrong number");
		}
		else{
			System.out.println(number + " is not Armstrong number");
		}
	}

	//Method to check if a number is an Armstrong number
	public static boolean isArmstrong(int number){
		int original = number, sum=0, digits =0;

		int temp = number;
		while (temp>0) {
			digits++;
			temp/=10;
		}

		temp = number;
		while (temp>0) {
			int digit = temp%10;
			sum+=Math.pow(digit, digits);
			temp/=10;
		}
		return sum==original;
	}
}