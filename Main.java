class Main{
	String name = "Tushar";
	int id =1;
	int salary=1000000;
	int exp = 0;

	public void getName(){
		System.out.println("My name" + name);
	}
	public void getId(){
		getName();
		System.out.println("My id "+id);
	}
	public void getSalary(){
		getId();
		System.out.println("My salary" + salary);
	}
	public void getExperience(){
		getSalary();
		System.out.println("My experience" + exp);
	}

	public static void main(String [] args){
		System.out.println("My All information");
		Main EM = new Main ();
		EM.getExperience();
	}
}