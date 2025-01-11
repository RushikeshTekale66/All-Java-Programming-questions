import java.util.Scanner;
class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		String [] arr = {"rushi", "tekale", "rushikeshr"};

		for(int i=0; i<arr.length; i++){
			String str = arr[i];
			int len = str.length()-1;
			if(str.charAt(0)==str.charAt(len)){
				System.out.println(str);
			}
		}
	}
}