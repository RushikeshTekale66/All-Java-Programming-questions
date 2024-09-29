
class Main {
    public void sum() throws ArithmeticException {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public static void main(String[] args) {
            Main m = new Main();
            m.sum();
    }
}