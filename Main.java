/**
 * Main
 */

class OverLoad {

    public void MathOP(int a, int b) {
        System.out.println("Addition is : " + (a + b));
    }

    //Overloading
    public void MathOP(int a, double b) {
        System.out.println("Substraction is : " + (a-b));
    }
}

public class Main {

    public static void main(String[] args) {
        OverLoad o = new OverLoad();
        o.MathOP(10, 5.5);
        o.MathOP(10, 10);
    }
}