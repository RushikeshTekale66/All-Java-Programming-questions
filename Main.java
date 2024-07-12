public class Main
{
    public int div(int a, int b){
        return a%b;
    }   
	public static void main(String[] args) {
        Main a = new Main();
        System.out.println("Reminder is : " + a.div(30, 20));
	}
}
