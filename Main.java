class Main{
	public static void main(String [] args){

		//Using while loop
		int number = 19991919;
		int count = 0;
		
		System.out.println("Single digits are : ");
		while(number>0){
		    int digit = number%10;
		    System.out.println(digit);
		    
		    number = number/10;
		    count++;
		}
		System.out.println("Total Count of digit is " + count);

		//Using do while loop
		int number2 = 12345678;
		int count2 = 0;
		do{
		    int digit = number2%10;
		    System.out.println( digit);
		    
		    number2 = number2/10;
		    count2++;
		}while(number2>0);
		System.out.println("Total Count of digit" + count2);

		//Using for loop
		int number3 = 12345678;
		int count3 =0;
		for (int i = number3; i > 0; i = i / 10) {
            int digit = i % 10;
            count3++;
            System.out.println( digit);
        }
        System.out.println("Total Count of digit" + count3);
	}
}