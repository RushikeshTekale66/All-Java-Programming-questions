class Main{
	String name = "Rushikesh";
	int id = 100;

	//Static method
	public static void getName(){
		Main tm = new Main();
		System.out.println("My name is " + tm.name);
	}

	//Instance method
	public void getId(){
		System.out.println("My id is " + id);
	}
	public static void main(String [] args)
	{
		//Method calling by call name "Recomended for the static mathod"
		Main.getName();

		Main tm = new Main();
		//Method calling by object
		tm.getId();
	}
}