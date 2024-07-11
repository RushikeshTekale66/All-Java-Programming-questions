public class Main
{
    public int square (int s){
        int area = s*s;
        return area;
    }
    public int rectangle(int l, int w){
        int area = l*w;
        return area;
    }
    public double triangle(int b, int h){
        double area = 3.14*(b*h);
        return area;
    }
    public double circle(int r){
        double area = 3.14*(r*r);
        return area;
    }
    
	public static void main(String[] args) {
		Main sh = new Main();
		
		int sa = sh.square(10);
		System.out.println("Square area : " + sa);
		
		int ra = sh.rectangle(10, 10);
		System.out.println("Rectangle area : " + ra);
		
		double ta = sh.triangle(10, 10);
		System.out.println("Triangle area : " + ta);
		
		double ca = sh.circle(10);
		System.out.println("Circle area : " + ca);
	}
}
