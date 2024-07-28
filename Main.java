class Main{
	String name;
	public Main(String str){
		this.name = str;
	}
	public static void main(String [] args){
		Main m = new Main("Rushikesh ");
		System.err.println(m.name);
	}
}