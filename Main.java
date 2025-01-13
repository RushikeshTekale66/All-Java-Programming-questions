public class Main {

	public static void main(String[] args) {
		String [] arr = {"geek", "leet", "geekg", "rushir"};

		for(int i=0; i<arr.length; i++){
			String str = arr[i];
			int len = str.length()-1;
			if(str.charAt(0)==str.charAt(len)){
				System.out.println(str);
			}
		}
	}
}