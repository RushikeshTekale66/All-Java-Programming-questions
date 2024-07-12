class Main{
	public Main(){
		System.out.println("Non paramether Main");
	}
	public Main(String str){
		System.out.println("Paramether Main " + str);
	}
	
	public static void main(String [] args)
	{
		Main ct = new Main();
		
		Main npc = new Main("I");
	}
}