class Main{

	public static void loop(int start,int end){
		if(start <= end){
		System.out.println(start);
		loop(start + 1, end);
		}
	}
	public static void main(String [] args){
		loop(11, 20);
	}
}