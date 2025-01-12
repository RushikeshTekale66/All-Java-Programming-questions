import java.util.Scanner;
class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string to check palindrome");
		String str = sc.nextLine();

		boolean result = true;
		
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				result = false;
			}
		}

		if(result){
			System.out.println("String is palindrom");
		}
		else{
			System.out.println("String is not palindrom");
		}
	}
}