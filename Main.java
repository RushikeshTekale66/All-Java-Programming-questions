import java.util.Scanner;
class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");
		String str = sc.nextLine();

		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<str.length(); j++){
				if(str.charAt(i)==str.charAt(j)){
					System.out.println(str.charAt(i));
				}
			}
		}
	}
}