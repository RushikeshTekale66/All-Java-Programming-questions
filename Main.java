
class Addition extends RuntimeException{
    public Addition(String msg){
        super(msg);
    }
}

class Main {
    public void sum(){
        int a = 10;
        int b = 0;
        try {
            System.out.println(a + b);
            throw new Addition("Error in addition");
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public static void main(String[] args) {
            Main m = new Main();
            m.sum();
    }
}